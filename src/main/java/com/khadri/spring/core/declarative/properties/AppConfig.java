package com.khadri.spring.core.declarative.properties;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource({"classpath:db.properties","classpath:food.properties","./config/app.properties"})
public class AppConfig {
}
