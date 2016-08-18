package com.revature.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansTesting {

	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("dataBeans.xml");
		System.out.println("what");
	}

}
