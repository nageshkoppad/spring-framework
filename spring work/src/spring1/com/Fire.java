package spring1.com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.xworkz.Power;

@Configuration
@ComponentScan("spring")
public class Fire {

	@Bean
	public int two() {
		return 30;
	}
	@Bean
	public int one() {
		return 25;
	}
}
