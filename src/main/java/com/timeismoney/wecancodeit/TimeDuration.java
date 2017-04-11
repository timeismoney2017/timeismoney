package com.timeismoney.wecancodeit; 

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class TimeDuration {
	private long userTime;
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	@JsonIgnore
	private String content;
	
	protected TimeDuration() {
		
	}
	public TimeDuration(long id, String content, long userTime) {
		this.id = id;
		this.content = content;
		this.userTime = userTime;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public long getUserTime() {
		return userTime;
	}
}
