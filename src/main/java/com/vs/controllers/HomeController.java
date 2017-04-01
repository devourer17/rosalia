package com.vs.controllers;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vs.services.HomeService;


@Controller
public class HomeController {

	@Autowired
	HomeService homeService;
	
	@GET
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String returnsIndexPage(){
		return homeService.redirectToHomePage();
	}
}
