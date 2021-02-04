package com.diptom.spring.springcores.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diptom.spring.springcores.map.Customer;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/diptom/spring/springcores/properties/propertiesconfig.xml");
		CountriesAndLanguage customer = (CountriesAndLanguage) classPathXmlApplicationContext.getBean("lang");
		System.out.println(customer);

	}

}
