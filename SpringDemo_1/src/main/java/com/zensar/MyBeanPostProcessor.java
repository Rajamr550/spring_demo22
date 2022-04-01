package com.zensar;

import org.springframework.beans.factory.config.BeanPostProcessor;




public class MyBeanPostProcessor  implements 
BeanPostProcessor{
    
    public Object postProcessAfterInitialization(Object bean,String beanName) {
	System.out.println(" " + beanName);
	return bean;
    }

    
    public Object postProcessBeforeInitialization(Object bean,String beanName) {
   	
	if(bean instanceof LifeCycleBean) {
	    LifeCycleBean lifeCycleBean = (LifeCycleBean) bean;
	    lifeCycleBean.setPrice(9000);
	}
	
	System.out.println(" before post processor " + beanName + "--" + bean);
	return bean;
       }
    
    
    
    
}
