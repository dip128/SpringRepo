package com.diptom.spring.springcores.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/diptom/spring/springcores/reftypes/refconfig.xml");
		
		Student bean = (Student) classPathXmlApplicationContext.getBean("student");
	
		System.out.println(bean);
	}

}
