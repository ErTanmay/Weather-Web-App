package com.tsl.weather_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.tsl.weather_app.model.GeocodingCityResponse;
import com.tsl.weather_app.model.WeatherDescription;
import com.tsl.weather_app.model.WeatherResponse;
import com.tsl.weather_app.types.Temperature;
import com.tsl.weather_app.types.WeatherCode;
import com.tsl.weather_app.types.Wind;
import com.tsl.weather_app.util.WeatherUtil;

@Service
public class WeatherService {
	
	 private final WebClient webClient = WebClient.create();
	 
	 @Autowired
	 WeatherUtil weatherUtil;

	    public WeatherResponse getCityCoordinates(String city) {
	        String url = "https://geocoding-api.open-meteo.com/v1/search?name=" + city + "&count=1";
	        
	        GeocodingCityResponse gr = webClient.get()
	                .uri(url)
	                .retrieve()
	                .bodyToMono(GeocodingCityResponse.class)
	                .block();
	        
	        return getCityWeather(gr.getResults()[0].getLatitude(), gr.getResults()[0].getLongitude());
	    }
	    
	    public WeatherResponse getCityWeather(double latitude, double longitude) {
	        String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude + "&longitude=" + longitude + "&current_weather=true";
	        return webClient.get()
	                .uri(url)
	                .retrieve()
	                .bodyToMono(WeatherResponse.class)
	                .block(); 
	    }

		public WeatherDescription getWeatherDesc(WeatherResponse geo) {
			
			WeatherDescription weatherDescription = new WeatherDescription();
			
			Temperature temp = weatherUtil.getTemperature(geo);
			weatherDescription.setTemperature(temp);
			
			Wind wind = weatherUtil.getWind(geo);
			weatherDescription.setWind(wind);
			
			WeatherCode weatherCode = weatherUtil.getWeatherCode(geo);
			weatherDescription.setWeatherCode(weatherCode);
			
			return weatherDescription;
			
		}
}
