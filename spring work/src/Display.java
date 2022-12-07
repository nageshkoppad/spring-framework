import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.xworkz.Power;
import spring1.com.Fire;


public class Display {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Fire.class);
		Fire p=context.getBean(Fire.class);
		System.out.println(p.one());
	}

}
