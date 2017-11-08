package com.libertymutual.goforcode.viciousvalet.models;

public class Car {

	// Methods: create, locate, park

	private String license;
	private String state;
	private String color;
	private String make;
	private String model;
	
	public Car(String license, String state, String color, String make, String model) {
		this.license = license;
		this.state = state;
		this.color = color;
		this.make = make;
		this.model = model;
	}

}
