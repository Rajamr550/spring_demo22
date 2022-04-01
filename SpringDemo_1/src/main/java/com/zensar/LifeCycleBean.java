package com.zensar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycleBean  implements ApplicationContextAware,InitializingBean{
private double price;

public LifeCycleBean() {
    System.out.println("imnside default");
}

public LifeCycleBean(double price) {
    super();
    this.price = price;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

@Override
public String toString() {
    return "LifeCycleBean [price=" + price + "]";
}

public void afterPropertiesSet() throws Exception {
    // TODO Auto-generated method stub
    
    
}

public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    // TODO Auto-generated method stub
    System.out.println("aware " + applicationContext);

}





}
