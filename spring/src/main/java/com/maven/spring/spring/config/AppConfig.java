package com.maven.spring.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.maven.spring.spring.Alien;
import com.maven.spring.spring.Desktop;
import com.maven.spring.spring.Laptop;

@Configuration
@ComponentScan("com.maven.spring.spring")
public class AppConfig {
	
//	@Bean(name="dk")
//	@Scope("prototype")
//	public Desktop compile1() {
//		return new Desktop();
//	}
//	@Bean
//	public Alien alien() {
//		Alien obj = new Alien();
//		obj.setCom(compile1());
//		return obj;
//	}
//	
//	@Bean
//	public Laptop lap() {
//		return new Laptop();
//	}
}
