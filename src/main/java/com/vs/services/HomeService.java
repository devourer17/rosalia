package com.vs.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

	public String redirectToHomePage(){
		return "index";
	}
}
