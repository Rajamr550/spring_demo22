package com.zensar;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest implements BeanNameAware {
	private String message;
	
	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
	Item item = (Item) iocContainer.getBean("itemBean");


	public BeanTest() {
		super();
		System.out.println("Inside constructor");
	}

	public void myInit() {
		System.out.println("myInit()");
	}
	public void myDestroy() {
		System.out.println("myDestroy()");
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("setMessage(): " + this.message);
	}

	@Override
	public String toString() {
		return "MessagePrinterBean [message=" + message + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
		
	}

	public void setBeanName(String name) {
		System.out.println("Inside setBeanName(): " + name);
	}
	
}
