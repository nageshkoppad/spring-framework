package com.details.laptop.configer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@ComponentScan("com.details")
public class LaptopConfiger {
    public LaptopConfiger() {
    	System.out.println(getClass().getSimpleName());
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean local() {
    	LocalContainerEntityManagerFactoryBean fire=new LocalContainerEntityManagerFactoryBean();
        fire.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
    	return fire;
    }
}
