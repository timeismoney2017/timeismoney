package com.timeismoney.wecancodeit; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TimeDuration {
	private long userTime;
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	@JsonIgnore
	private String content;
	
<<<<<<< HEAD:src/main/java/com/timeismoney/wecancodeit/TimeDuration.java
	protected TimeDuration() {
=======
	@ManyToOne
	private Category category;
	
	protected TimeDuration() {
>>>>>>> 1534843d19009a6501fb76329f25e3a56322cfc8:src/main/java/com/timeismoney/wecancodeit/Greeting.java
		
	}
	public TimeDuration(long id, long userTime) {
		this.id = id;
		this.userTime = userTime;
	}

	public long getId() {
		return id;
	}

	public long getUserTime() {
		return userTime;
	}
}
