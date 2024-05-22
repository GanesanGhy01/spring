package com.maven.spring.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Autowired
	@Qualifier("laptop")
	private Computer com;
	
	public void code() {
		com.compile();
	}
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

}
