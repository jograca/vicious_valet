package com.libertymutual.goforcode.viciousvalet.models;

import java.util.ArrayList;

public class Lot {
	
	private int lotCapacity;
	
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
	
	// Method to add a car to the Lot
	
	public void addCarToLot(Car newCar) {
		carList.add(newCar);
	}

	// Method to find number of cars on lot (size of array)
	
	public int findCarsOnLot() {
		return carList.size();
	}

	// Getters and setters for lot capacity
	
	public int getLotCapacity() {
		return lotCapacity;
	}

	public void setLotCapacity(int lotCapacity) {
		this.lotCapacity = lotCapacity;
	}	
}
