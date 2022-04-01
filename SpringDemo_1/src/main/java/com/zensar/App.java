package com.zensar;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
	int totalPrice = 0;
//IoC container provided by Spring framework
	AbstractApplicationContext iocContainer = new ClassPathXmlApplicationContext("beans.xml");
	Item item = (Item) iocContainer.getBean("itemBean");
	Order order = (Order) iocContainer.getBean("orderBean");
	Map<String, Item> beans = iocContainer.getBeansOfType(Item.class);

	for (Item price : beans.values()) {
	    totalPrice += price.getPrice();
	}
	System.out.println("Total Price : " + totalPrice);
    }
}