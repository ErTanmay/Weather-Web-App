package com.tsl.weather_app.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
public class City {

	private String name;
	private String latitude;
	private String longitude;
	private String country;
	private String timezone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	
	
	public City() {
		super();
	}
	public City(String name, String latitude, String longitude, String country, String timezone) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.country = country;
		this.timezone = timezone;
	}
	
	@Override
	public String toString() {
		return "City [name=" + name + ", latitude=" + latitude + ", longitude=" + longitude + ", country=" + country
				+ ", timezone=" + timezone + "]";
	}

}
