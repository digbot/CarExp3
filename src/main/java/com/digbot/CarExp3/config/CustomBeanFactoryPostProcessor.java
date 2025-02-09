package com.digbot.CarExp3.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {

        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for(String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
           // System.out.println("PRINT ---> " + beanDefinition);
        }
        // Example: Modify a bean definition before it's instantiated

        /*
        if (beanFactory.containsBeanDefinition("someBean")) {
            beanFactory.getBeanDefinition("someBean").setLazyInit(true);
        }*/
    }
}
