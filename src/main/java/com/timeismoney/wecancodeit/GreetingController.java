package com.timeismoney.wecancodeit;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class GreetingController {
	private GreetingRepository repo;

	@Autowired
	public GreetingController(GreetingRepository repo) {
		this.repo = repo;
	}
	
//	@RequestMapping(value = "/greeting", method = RequestMethod.GET, headers = "Accept = application/json")
//	public @ResponseBody Iterable<Greeting> findGreeting() {
//		return repo.findAll();
//	}

	@GetMapping(value = "/greeting", headers = "Accept = application/json")
	public Iterable<Greeting> findGreeting(Greeting greeting) {
		return repo.findAll();
	}

//	@RequestMapping(value = "/greeting", method = RequestMethod.POST, headers = "Accept = application/json")
//		ResponseEntity<Greeting> add(@RequestBody Greeting input) {
//			Greeting result = repo.save(input);
//			URI location = ServletUriComponentsBuilder
//					.fromCurrentRequest().path("/{id}")
//					.buildAndExpand(result.getId()).toUri();
//	
//				return ResponseEntity.created(location).build();
//	}
	
	@RequestMapping(value = "/greeting")
	ResponseEntity<Greeting> add(Greeting input) {
		Greeting result = repo.save(input);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(result.getId()).toUri();

			return ResponseEntity.created(location).build();
	}

}
