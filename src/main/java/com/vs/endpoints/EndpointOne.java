package com.vs.endpoints;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vs.services.HomeService;
import com.vs.services.ServiceOne;

/* @author singhvp */

@RestController
@RequestMapping(value = "/firstEndpoint")
public class EndpointOne {

	@Autowired
	ServiceOne serviceOne;
	
	@GET
	@RequestMapping(value = "/firtMethod", method = RequestMethod.GET)
	public ResponseEntity<String> firstMethod(){
		return new ResponseEntity<String>("Success", HttpStatus.ACCEPTED);
	}
	
}
