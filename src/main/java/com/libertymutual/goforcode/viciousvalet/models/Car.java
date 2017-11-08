package com.libertymutual.goforcode.viciousvalet.models;

public class Car {

	private String license;
	private String state;
	private String color;
	private String make;
	private String model;
	private String location;

	public Car(String license, String state, String color, String make, String model, String location) {
		this.license = license;
		this.state = state;
		this.color = color;
		this.make = make;
		this.model = model;
		this.location = location;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getLocation() {
		return location;
	}

}
