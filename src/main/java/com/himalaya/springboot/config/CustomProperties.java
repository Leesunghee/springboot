package com.himalaya.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@ConstructorBinding
@ConfigurationProperties("my")
//@Configuration
public class CustomProperties {
    
    private final long height;

    public CustomProperties(long height) {
        this.height = height;
    }

    public long getHeight() {
        return height;
    }
}
