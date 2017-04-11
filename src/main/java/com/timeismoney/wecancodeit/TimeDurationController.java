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
<<<<<<< HEAD:src/main/java/com/timeismoney/wecancodeit/TimeDurationController.java
	private TimeDurationRepository repo;

<<<<<<< HEAD
=======
	
	
	@CrossOrigin(origins = "https://sleepy-fjord-84553.herokuapp.com/time")
>>>>>>> 1534843d19009a6501fb76329f25e3a56322cfc8:src/main/java/com/timeismoney/wecancodeit/GreetingController.java
=======
>>>>>>> refactor_names
	@GetMapping(value = "/time")
	public Iterable<TimeDuration> findGreeting() {
		return  repo.findAll();
	}

	
	@RequestMapping(value = "/time", method = RequestMethod.POST)
	public ResponseEntity<TimeDuration> update(@RequestBody TimeDuration time) {

		return new ResponseEntity<>(repo.save(time), HttpStatus.CREATED);
	}

}
