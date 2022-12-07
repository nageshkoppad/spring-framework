package com.net.sim.dto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.net.sim.dto.Sim;
import com.net.sim.repositoryimpl.SimRepositoryImpl;
import com.net.sim.serviceimpl.SimServiceImpl;

@Configuration
@ComponentScan("com.net.sim")
public class SimpConfig {
  
	@Bean
	public Sim sim() {
		return new Sim();
	}
	
	@Bean
	public SimRepositoryImpl service() {
		return new SimRepositoryImpl();
	}
}
