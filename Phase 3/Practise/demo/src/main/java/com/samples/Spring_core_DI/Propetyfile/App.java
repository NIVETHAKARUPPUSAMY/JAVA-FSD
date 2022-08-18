package com.samples.Spring_core_DI.Propetyfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/samples/Spring_core_DI/Propetyfile/SpringConfig.xml");
		MyDAO dao = (MyDAO) context.getBean("dao");
		System.out.println(dao);
		
	}

}
