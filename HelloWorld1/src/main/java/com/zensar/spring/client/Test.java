package com.zensar.spring.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.beans.Employee;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		//Employee employee = (Employee)context.getBean("emp");
		
		Employee employee=context.getBean(Employee.class,"employee");
		
		System.out.println(employee);		
		
	}	
	
}

