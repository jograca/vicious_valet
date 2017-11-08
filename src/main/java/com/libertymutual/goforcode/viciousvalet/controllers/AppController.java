package com.libertymutual.goforcode.viciousvalet.controllers;

import java.util.EmptyStackException;

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
	//private int capacity = carLot.getLotCapacity();
	
	// Constructor
	public AppController() {
		carLot = new Lot();
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String color, String make, String model) {
		// if license is not null and the length of license is greater than 0
		// create a new instance of the car class from the values submitted
		
		if (license != null && !license.isEmpty() 
				&& state != null && !state.isEmpty()
				&& color != null && !color.isEmpty()
				&& make != null && !make.isEmpty()
				&& model != null && !model.isEmpty()){
			
			Car newCar = new Car (license, state, color, make, model);
			
			// park the car in the lot (how do we do this?) 
			// Add a method to the Lot class and call that method
			
			carLot.addCarToLot(newCar);
			carsOnLot = carLot.findCarsOnLot();
			openSpots = carLot.getLotCapacity();
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");

		// Add the Car lot so that I can see the list of cars in the view
		mv.addObject("lot", carLot);
		mv.addObject("parked", carsOnLot);
		mv.addObject("opened", openSpots);
		//mv.addObject("capacity", capacity);
		
		return mv;
	}

}
