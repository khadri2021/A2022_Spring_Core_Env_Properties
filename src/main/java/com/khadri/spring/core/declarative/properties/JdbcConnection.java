package com.khadri.spring.core.declarative.properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    @Autowired
    private Environment environment;

    public String getPropertyByName(String key){
        return environment.getProperty(key);
    }
}
