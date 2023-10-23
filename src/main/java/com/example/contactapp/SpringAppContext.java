package com.example.contactapp;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//accessing spring managed beans from any part of application by name
//BeanFactory is an interface representing a container that provides and manages bean instances.
// interface representing a container holding all information, metadata and beans in the application

//The Spring Beans are Java Objects that are initialized by the Spring IoC container.
public class SpringAppContext implements ApplicationContextAware {
    private static ApplicationContext CONTEXT;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT = applicationContext;
    }
    public static Object getBean(String beanName) {
        return CONTEXT.getBean(beanName);
    }
}

