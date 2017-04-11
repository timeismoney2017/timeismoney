package com.timeismoney.wecancodeit;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)  
	private Collection<Greeting> greeting;
	
	private Category() {
	}
	
	public Category(String title, String description) {
		this(title, description, Collections.emptyList());
	}
	
	public Category(String title, String description, Collection<Greeting> greeting) {
		this.title = title;
		this.greeting = greeting;
		this.description = description;
	}

	public Collection<Greeting> getGreeting() {
		return greeting;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
}