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
public class TimeDurationController {
	@Resource
	private TimeDurationRepository repo;

	@GetMapping(value = "/greeting")
	public Iterable<TimeDuration> findGreeting() {
		return  repo.findAll();
	}

	
	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public ResponseEntity<TimeDuration> update(@RequestBody TimeDuration greeting) {

		return new ResponseEntity<>(repo.save(greeting), HttpStatus.CREATED);
	}

}
