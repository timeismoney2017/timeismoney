package com.timeismoney.wecancodeit;


import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {
	@Resource
	private GreetingRepository repo;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping(value = "/greeting")
	public Iterable<Greeting> findGreeting() {
		return  repo.findAll();
	}

	
	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public ResponseEntity<Greeting> update(@RequestBody Greeting greeting) {

		return new ResponseEntity<>(repo.save(greeting), HttpStatus.CREATED);
	}

}
