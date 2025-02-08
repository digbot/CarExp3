package com.digbot.CarExp3.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
        System.out.println("1111111111111111111111111 Inside postProcessBeanFactory");

        // Example: Modify a bean definition before it's instantiated
        if (beanFactory.containsBeanDefinition("someBean")) {
            beanFactory.getBeanDefinition("someBean").setLazyInit(true);
        }
    }
}
