package com.tsl.weather_app.types;

import org.springframework.stereotype.Component;

public class WeatherCode {
	
	private int code;
	private String desc;
	
	public WeatherCode() {
		super();
	}

	public WeatherCode(int code, String desc) {
		super();
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "WeatherCode [code=" + code + ", desc=" + desc + "]";
	}
	
	

}
