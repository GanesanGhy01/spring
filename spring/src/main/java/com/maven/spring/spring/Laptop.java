package com.maven.spring.spring;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	
	public void hp() {
		System.out.println("hp");
	}
	public void compile() {
		System.out.println("laptop..");
	}
}
