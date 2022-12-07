package com.net.sim.dto.display;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.net.sim.dto.config.SimpConfig;
import com.net.sim.repositoryimpl.SimRepositoryImpl;
import com.net.sim.serviceimpl.SimServiceImpl;

public class Executive {

	public static void main(String[] args) {
		   ApplicationContext spring=new AnnotationConfigApplicationContext(SimpConfig.class);
		   SimServiceImpl sim=spring.getBean(SimServiceImpl.class);
		   System.out.println(sim);
	}

}
