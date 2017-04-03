package com.vs.serviceimpl;

import org.springframework.stereotype.Service;

import com.vs.services.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	public String redirectToHomePage(){
		return "index";
	}
}
