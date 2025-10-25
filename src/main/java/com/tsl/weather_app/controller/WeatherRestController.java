package com.tsl.weather_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsl.weather_app.model.GeocodingCityResponse;
import com.tsl.weather_app.model.WeatherDescription;
import com.tsl.weather_app.model.WeatherResponse;
import com.tsl.weather_app.service.WeatherService;

@RestController
@RequestMapping("/api/v1/weather")
public class WeatherRestController {
	
	@Autowired
	WeatherService weatherService;
	
	@GetMapping("/get/{city}")
	public ResponseEntity<WeatherDescription> getWeather(@PathVariable String city) {
		WeatherResponse geo = weatherService.getCityCoordinates(city);
		return ResponseEntity.status(HttpStatus.OK)
					.body(weatherService.getWeatherDesc(geo));
	}
		
	

}
