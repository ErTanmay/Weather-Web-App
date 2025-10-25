package com.tsl.weather_app.model;

import org.springframework.stereotype.Component;

import com.tsl.weather_app.types.Temperature;
import com.tsl.weather_app.types.WeatherCode;
import com.tsl.weather_app.types.Wind;

@Component
public class WeatherDescription {

	private Temperature temperature;
	private Wind wind;
	private WeatherCode weatherCode;
	
	public WeatherDescription() {
		super();
	}

	public WeatherDescription(Temperature temperature, Wind wind, WeatherCode weatherCode) {
		super();
		this.temperature = temperature;
		this.wind = wind;
		this.weatherCode = weatherCode;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public WeatherCode getWeatherCode() {
		return weatherCode;
	}

	public void setWeatherCode(WeatherCode weatherCode) {
		this.weatherCode = weatherCode;
	}

	@Override
	public String toString() {
		return "WeatherDescription [time=" + ", temperature=" + temperature + ", wind=" + wind + ", weatherCode="
				+ weatherCode + "]";
	}
	
}
