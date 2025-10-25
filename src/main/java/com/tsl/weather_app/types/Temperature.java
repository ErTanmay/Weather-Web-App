package com.tsl.weather_app.types;

public class Temperature {
	
	private double tempVal;
	private String tempUnit;
	private String tempDesc;
	
	public Temperature() {
		super();
	}

	public Temperature(double tempVal, String tempUnit, String tempDesc) {
		super();
		this.tempVal = tempVal;
		this.tempUnit = tempUnit;
		this.tempDesc = tempDesc;
	}
	
	public double getTempVal() {
		return tempVal;
	}
	public void setTempVal(double tempVal) {
		this.tempVal = tempVal;
	}
	public String getTempUnit() {
		return tempUnit;
	}
	public void setTempUnit(String tempUnit) {
		this.tempUnit = tempUnit;
	}
	public String getTempDesc() {
		return tempDesc;
	}
	public void setTempDesc(String tempDesc) {
		this.tempDesc = tempDesc;
	}

	@Override
	public String toString() {
		return "Temperature [tempVal=" + tempVal + ", tempUnit=" + tempUnit + ", tempDesc=" + tempDesc + "]";
	}
	
}
