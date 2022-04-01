package com.zensar;



import java.util.Map;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
public static void main(String[] args) {
AbstractApplicationContext iocContainer =
new ClassPathXmlApplicationContext("beans.xml");

Item item = (Item) iocContainer.getBean("itemBean");

Order order = (Order) iocContainer.getBean("orderBean");




System.out.println("order1 " + order);

Map<String, Item> map=iocContainer.getBeansOfType(Item.class);

for(Item price:map.values()) {
double totalPrice = price.getPrice();
System.out.println(totalPrice);
}

iocContainer.registerShutdownHook();


}
}