package com.libertymutual.goforcode.viciousvalet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.viciousvalet.models.Lot;

@Controller
public class AppController {

	private Lot carLot;

	// Constructor
	public AppController() {
		carLot = new Lot();
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String color, String make, String model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");

		return mv;
	}

}
