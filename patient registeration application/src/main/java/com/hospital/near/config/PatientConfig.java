package com.hospital.near.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan("com.hospital")
public class PatientConfig {

 public PatientConfig() {
	 System.out.println(getClass().getSimpleName());
 }
 @Bean
 public LocalContainerEntityManagerFactoryBean local() {
	 LocalContainerEntityManagerFactoryBean fine=new LocalContainerEntityManagerFactoryBean();
	fine.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	 return fine;
 }
}
