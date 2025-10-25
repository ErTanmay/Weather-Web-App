package com.tsl.weather_app.util;

import org.springframework.stereotype.Service;

import com.tsl.weather_app.model.WeatherResponse;
import com.tsl.weather_app.types.Temperature;
import com.tsl.weather_app.types.WeatherCode;
import com.tsl.weather_app.types.Wind;

@Service
public class WeatherUtil {

	public Temperature getTemperature(WeatherResponse geo) {
		
		Temperature temperature = new Temperature();
		double temp = geo.getCurrent_weather().getTemperature();
		String desc ;
		
		if (temp < 0)
	        desc =  "Freezing ❄️ (Ice, snow, frostbite risk)";
	    else if (temp < 10)
	        desc =  "Very Cold 🧥 (Winter morning, need heavy jacket)";
	    else if (temp < 20)
	        desc =  "Cool 🌬️ (Pleasant weather, light sweater ok)";
	    else if (temp < 25)
	        desc =  "Mild 🌤️ (Comfortable, ideal for outings)";
	    else if (temp < 30)
	        desc =  "Warm ☀️ (Slightly hot, typical Indian daytime)";
	    else if (temp < 35)
	        desc =  "Hot 🔥 (Sweaty weather, need hydration)";
	    else if (temp < 40)
	        desc =  "Very Hot 🥵 (Summer heat, risk of dehydration)";
	    else
	        desc =  "Scorching ☀️🔥 (Extreme heat, stay indoors advised)";
	
		temperature.setTempDesc(desc);
		temperature.setTempUnit(geo.getCurrent_weather_units().getTemperature());
		temperature.setTempVal(temp);
		return temperature;
	}

	public Wind getWind(WeatherResponse geo) {
		
		Wind wind = new Wind();
		
		double windSpeed = geo.getCurrent_weather().getWindspeed();
		double degrees = geo.getCurrent_weather().getWinddirection();
		String desc, dirDesc;
		
		 if (windSpeed <= 5)
		        desc =  "Calm 🌿 (Still air, smoke rises vertically)";
		    else if (windSpeed <= 11)
		        desc =  "Light breeze 🍃 (Leaves rustle slightly)";
		    else if (windSpeed <= 19)
		        desc =  "Gentle breeze 🌤️ (Small twigs move)";
		    else if (windSpeed <= 29)
		        desc =  "Moderate breeze 🌬️ (Dust and paper lifted)";
		    else if (windSpeed <= 39)
		        desc =  "Fresh breeze 🌪️ (Small branches move)";
		    else if (windSpeed <= 50)
		        desc =  "Strong breeze 💨 (Walking against wind feels hard)";
		    else if (windSpeed <= 61)
		        desc =  "Near gale 🌫️ (Tree branches sway)";
		    else if (windSpeed <= 74)
		        desc =  "Gale 🌪️ (Difficult to move, small damage possible)";
		    else if (windSpeed <= 88)
		        desc =  "Strong gale ⛈️ (Trees uprooted, minor structural damage)";
		    else
		        desc =  "Storm / Hurricane 🌪️ (Severe damage likely)";
		 
		 if ((degrees >= 0 && degrees < 45) || degrees == 360)
		        dirDesc =  "North (N) – Wind blowing from the North";
		    else if (degrees >= 45 && degrees < 135)
		        dirDesc =  "East (E) – Wind blowing from the East";
		    else if (degrees >= 135 && degrees < 225)
		        dirDesc =  "South (S) – Wind blowing from the South";
		    else if (degrees >= 225 && degrees < 315)
		        dirDesc =  "West (W) – Wind blowing from the West";
		    else
		        dirDesc =  "North (N) – Wind blowing from the North"; // fallback
		 
		 wind.setWindDesc(desc);
		 wind.setWindSpeed(windSpeed);
		 wind.setWindDirection(dirDesc);
		 wind.setWindUnit(geo.getCurrent_weather_units().getWindspeed());
		 
		return wind;
	}

	public WeatherCode getWeatherCode(WeatherResponse geo) {
		
		WeatherCode weatherCode = new WeatherCode();
		
		int code = geo.getCurrent_weather().getWeathercode(); 
		String desc;
		
		switch (code) {
        case 0 -> desc = "Clear sky";
        case 1, 2 -> desc = "Partly cloudy";
        case 3 -> desc = "Overcast";
        case 45, 48 -> desc = "Foggy";
        case 51, 53, 55 -> desc = "Light drizzle";
        case 56, 57 -> desc = "Freezing drizzle";
        case 61, 63, 65 -> desc = "Rainy";
        case 66, 67 -> desc = "Freezing rain";
        case 71, 73, 75, 77 -> desc = "Snowy";
        case 80, 81, 82 -> desc = "Rain showers";
        case 95 -> desc = "Thunderstorm";
        case 96, 99 -> desc = "Thunderstorm with hail";
        default -> desc = "Unknown weather condition"; };
    
		weatherCode.setCode(code);
		weatherCode.setDesc(desc);
		
		return weatherCode;
	}
	

}
