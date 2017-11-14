package com.libertymutual.goforcode.viciousvalet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.viciousvalet.models.Car;
import com.libertymutual.goforcode.viciousvalet.models.Lot;

@Controller
public class AppController {

	private Lot carLot;
	private int carsOnLot;
	private int openSpots;
	private int capacity;
	private boolean full;
	
	// Constructor
	public AppController() {
		carLot = new Lot(5);
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String color, String make, String model, String location) {
		// if license is not null and the length of license is greater than 0
		// create a new instance of the car class from the values submitted
		
		if (license != null && !license.isEmpty() 
				&& state != null && !state.isEmpty()
				&& color != null && !color.isEmpty()
				&& make != null && !make.isEmpty()
				&& model != null && !model.isEmpty()
				&& location != null && !location.isEmpty()){
			
			Car newCar = new Car (license, state, color, make, model, location);
			
			// park the car in the lot (how do we do this?) 
			// Add a method to the Lot class and call that method
			
			carLot.addCarToLot(newCar);
			carsOnLot = carLot.findCarsOnLot();
			openSpots = carLot.openLotSpots();
			capacity = carLot.getLotCapacity();
			full = carLot.isLotFull();
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");

		// Add the Car lot so that I can see the list of cars in the view
		mv.addObject("lot", carLot);
		mv.addObject("parked", carsOnLot);
		mv.addObject("opened", openSpots);
		mv.addObject("capacity", capacity);
		mv.addObject("full", full);
		
		return mv;
	}
	
	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		
		carLot.removeCarFromLot(carIndex);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		
		carsOnLot = carLot.findCarsOnLot();
		openSpots = carLot.openLotSpots();
		capacity = carLot.getLotCapacity();
		full = carLot.isLotFull();
		
		mv.addObject("lot", carLot);
		mv.addObject("parked", carsOnLot);
		mv.addObject("opened", openSpots);
		mv.addObject("capacity", capacity);
		mv.addObject("full", full);
		
		return mv;
	}
	
	@RequestMapping("removeAll")
	public ModelAndView removeAllCars() {
		
		carLot.removeALlCarsFromLot();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		
		carsOnLot = carLot.findCarsOnLot();
		openSpots = carLot.openLotSpots();
		capacity = carLot.getLotCapacity();
		full = carLot.isLotFull();
		
		mv.addObject("lot", carLot);
		mv.addObject("parked", carsOnLot);
		mv.addObject("opened", openSpots);
		mv.addObject("capacity", capacity);
		mv.addObject("full", full);
		
		return mv;
		
	}

}
