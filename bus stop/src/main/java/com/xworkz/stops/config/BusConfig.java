package com.xworkz.stops.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.xworkz")
public class BusConfig {

	@Bean
	public LocalEntityManagerFactoryBean local() {
		LocalEntityManagerFactoryBean fact=new LocalEntityManagerFactoryBean();
		fact.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return fact;
	}
}
