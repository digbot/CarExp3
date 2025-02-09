package com.digbot.CarExp3.components;

import com.digbot.CarExp3.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] arg) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
