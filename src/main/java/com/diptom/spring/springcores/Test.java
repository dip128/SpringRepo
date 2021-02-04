package com.diptom.spring.springcores;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	//private DBConfig dbConfig;
	
    
	

	public static void main(String[] args) {
		
		 	
			ClassPathXmlApplicationContext  ctx = new ClassPathXmlApplicationContext("config.xml");
			Employee bean = (Employee) ctx.getBean("emp");
			
			System.out.println("Employee id-"+bean.getId());
			System.out.println("Employee Name-"+bean.getName());
	}

}
