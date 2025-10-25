package com.tsl.weather_app.types;

import org.springframework.stereotype.Component;

public class Wind {

	private double windSpeed;
	private String windUnit;
	private String windDirection;
	private String windDesc;
	
	public Wind() {
		super();
	}


	public Wind(double windSpeed, String windUnit, String windDirection, String windDesc) {
		super();
		this.windSpeed = windSpeed;
		this.windUnit = windUnit;
		this.windDirection = windDirection;
		this.windDesc = windDesc;
	}


	public double getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}


	public String getWindUnit() {
		return windUnit;
	}


	public void setWindUnit(String windUnit) {
		this.windUnit = windUnit;
	}


	public String getWindDirection() {
		return windDirection;
	}


	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}


	public String getWindDesc() {
		return windDesc;
	}


	public void setWindDesc(String windDesc) {
		this.windDesc = windDesc;
	}


	@Override
	public String toString() {
		return "Wind [windSpeed=" + windSpeed + ", windUnit=" + windUnit + ", windDirection=" + windDirection
				+ ", windDesc=" + windDesc + "]";
	}
	
	
}
