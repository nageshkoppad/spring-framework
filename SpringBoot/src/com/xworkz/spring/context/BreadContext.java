package com.xworkz.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.Bread;
import com.xworkz.spring.config.BreadConfig;

public class BreadContext {
public static void main(String[] arg) {
	ApplicationContext contexte =new AnnotationConfigApplicationContext(BreadConfig.class);
      Bread ent=contexte.getBean(Bread.class);
      ent.roast();
}
}
