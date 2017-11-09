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

	public Lot(int lotCapacity) {
		this.lotCapacity = lotCapacity;
		carList = new ArrayList<Car>(); // set it to an initial value
	}

	// Method to add a car to the Lot

	public void addCarToLot(Car newCar) {
		if (!isLotFull()) {
			carList.add(newCar);
		}
	}
	
	// Method to remove a car from the lost
	
	public void removeCarFromLot(int carIndex) {
		carList.remove(carIndex - 1);
	}
	
	// Method to remove all cars from lot
	
	public void removeALlCarsFromLot() {
		
		carList.removeAll(getCarList());	
	}

	// Method to find number of cars on lot (size of array)

	public int findCarsOnLot() {
		return carList.size();
	}

	// Getters and setters for lot capacity

	public int getLotCapacity() {
		return lotCapacity;
	}

	// Method to return open spots on the lot
	
	public int openLotSpots() {
		return (lotCapacity - findCarsOnLot());
	}

	// Getters for Car List

	public ArrayList<Car> getCarList() {
		return carList;
	}
	
	// check to see if lot is full and return true or false
	
	public boolean isLotFull() {
		if (findCarsOnLot() < lotCapacity) {
			return false;
		} else {
			return true;
		}
	}
}
