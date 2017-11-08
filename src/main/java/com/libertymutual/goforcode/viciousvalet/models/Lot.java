package com.libertymutual.goforcode.viciousvalet.models;

import java.util.ArrayList;

public class Lot {

	// Methods: addCar, removeCar, isFull, totalCarsInLot
	// Attributes: capacity
	// Instantiate the variable

	private ArrayList<Car> carList; // declare - now it's available

	// Set the object
	// Constructor - initializes the object. Runs once when you create it
	// Has the same name as the class
	// Does not have a return type (ex: void, etc)

	public Lot() {
		carList = new ArrayList<Car>(); // set it to an initial value

	}

}
