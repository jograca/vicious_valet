package com.libertymutual.goforcode.viciousvalet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.viciousvalet.models.Car;

@Controller
public class AppController {

	private Car addedCar = new Car();
	
	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String color, String make, String model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("License", license);
		mv.addObject("State", state);
		mv.addObject("Color", color);
		mv.addObject("Make", make);
		mv.addObject("Model", model);
		
		addedCar.addCar();
		
		return mv;
	}
	
}
