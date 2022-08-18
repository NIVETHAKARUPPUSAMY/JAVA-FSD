package com.samples.Spring_core_DI.Constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// Creating SPRING COINTAINER
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/Spring_core_DI/Constructor/SpringConfig.xml");

		// setter injection

		Employee emp = (Employee) springContainer.getBean("emp");
		System.out.println(emp);

	}
}