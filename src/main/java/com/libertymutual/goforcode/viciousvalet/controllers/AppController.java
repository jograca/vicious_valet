package com.libertymutual.goforcode.viciousvalet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping("/")
	public ModelAndView showApp() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");

		return mv;
	}
	
}
