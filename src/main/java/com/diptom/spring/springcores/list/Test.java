package com.diptom.spring.springcores.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/diptom/spring/springcores/list/listconfig.xml");
		Hospital bean = (Hospital) classPathXmlApplicationContext.getBean("hos");
		System.out.println(bean.getDept());
		System.out.println(bean.getDept().getClass().getName());
		
	}

}
