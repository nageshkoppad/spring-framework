package com.xworkz.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.bean.Bread;

@Configuration
public class BreadConfig {

@Bean	
public Bread eat() {
	Bread bread=new Bread();
		return bread;
	}
}
