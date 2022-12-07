package java.spring.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Executive {

	public static void main(String[] args) {
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfigaration.class);
		ComponentClass com=spring.getBean(ComponentClass.class);
		System.out.println(com);
	}

}
