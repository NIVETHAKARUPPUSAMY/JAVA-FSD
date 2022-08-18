package com.samples.Spring_core_DI.Scopes;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// Creating SPRING COINTAINER
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/Spring_core_DI/Scopes/SpringConfig.xml");

		// setter injection

		Employee emp1 = (Employee) springContainer.getBean("emp");
		System.out.println(emp1.hashCode());

		Employee emp2 = (Employee) springContainer.getBean("emp");
		System.out.println(emp2.hashCode());

	}
}