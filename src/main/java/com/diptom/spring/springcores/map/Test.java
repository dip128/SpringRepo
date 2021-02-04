package com.diptom.spring.springcores.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/diptom/spring/springcores/map/mapconfig.xml");
		Customer customer = (Customer) classPathXmlApplicationContext.getBean("customer");
		System.out.println(customer);
	}

}
