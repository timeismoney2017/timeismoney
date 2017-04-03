package com.timeismoney.wecancodeit;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	@Resource
	private GreetingRepository repo;

	
	

	@GetMapping(value = "/greeting")
	public ResponseEntity<Greeting> findGreeting() {
		Greeting greeting = new Greeting();
		return new ResponseEntity<Greeting>(greeting, HttpStatus.CREATED);
	}

	
	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public ResponseEntity<Greeting> update(@RequestBody Greeting greeting) {

	    // TODO: call persistence layer to update
	    return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
	}

}
