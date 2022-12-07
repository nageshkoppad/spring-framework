package java.bean.abstraction.springboot;

import java.bean.abstraction.config.CinfigerationAll;
import java.bean.abstraction.service.CplusDetailsService;
import java.bean.abstraction.service.CplusDetailsServiceImpl;
import java.bean.abstraction.service.CshorpDetailsService;
import java.bean.abstraction.service.JavaDetailsService;
import java.bean.abstraction.service.MySqlDetailsService;
import java.bean.abstraction.service.PythonDetailsService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
	
           ApplicationContext spring=new AnnotationConfigApplicationContext(CinfigerationAll.class);
           CplusDetailsService plus=spring.getBean(CplusDetailsService.class);
           plus.validateAndsave(null);
           CshorpDetailsService shorp=  spring.getBean(CshorpDetailsService.class);
           shorp.saveAndvaliadte(null);
           JavaDetailsService java=spring.getBean(JavaDetailsService.class);
           java.validateAndSave(null);
           MySqlDetailsService mysql= spring.getBean(MySqlDetailsService.class);
           mysql.saveAndvalidate(null);
           PythonDetailsService python=spring.getBean(PythonDetailsService.class);
           python.saveAndvaliadate(null);
	}

}
