package java.spring.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("java.spring")
public class SpringConfigaration {

	public SpringConfigaration() {
		System.out.println("configeration is done");
	}
}
