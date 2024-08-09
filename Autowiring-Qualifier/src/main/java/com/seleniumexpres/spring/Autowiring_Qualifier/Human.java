package com.seleniumexpres.spring.Autowiring_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;

	public void pump() {
		heart.pump();
	}

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	

	
}
