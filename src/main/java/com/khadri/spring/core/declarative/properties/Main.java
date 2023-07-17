package com.khadri.spring.core.declarative.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        JdbcConnection jdbcConnection = context.getBean(JdbcConnection.class);
        System.out.println(jdbcConnection.getPropertyByName("food2"));
        System.out.println(jdbcConnection.getPropertyByName("project.name"));
    }
}