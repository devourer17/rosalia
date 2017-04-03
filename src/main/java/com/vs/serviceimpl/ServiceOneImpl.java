package com.vs.serviceimpl;

import org.springframework.stereotype.Service;

import com.vs.services.ServiceOne;

@Service
public class ServiceOneImpl implements ServiceOne {

	public String firstMethod(){
		return "Success";
	}
}
