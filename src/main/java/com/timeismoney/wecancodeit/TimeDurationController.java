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
public class TimeDurationController {
	@Resource
	private TimeDurationRepository repo;

	
	
	@CrossOrigin(origins = "https://sleepy-fjord-84553.herokuapp.com/time")
	@GetMapping(value = "/time")
	public Iterable<TimeDuration> findTimeDuration() {
		return  repo.findAll();
	}

	
	@RequestMapping(value = "/time", method = RequestMethod.POST)
	public ResponseEntity<TimeDuration> update(@RequestBody TimeDuration time) {

		return new ResponseEntity<>(repo.save(time), HttpStatus.CREATED);
	}

}
