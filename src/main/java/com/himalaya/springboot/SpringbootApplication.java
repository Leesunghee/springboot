package com.himalaya.springboot;

import com.himalaya.springboot.config.CustomProperties;
import com.himalaya.springboot.entity.Student;
import com.himalaya.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringbootApplication {

    private final Integer height;
    private final CustomProperties customProperties;

    @Autowired
    StudentService studentService;

    public SpringbootApplication(
            @Value("${my.height}") Integer height,
            CustomProperties customProperties
    ) {
        this.height = height;
        this.customProperties = customProperties;
    }


//    private Environment environment;
//    private ApplicationContext context;
//
//    private CustomProperties customProperties;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

//    public void printHeight() {
//        System.out.println("height = " + height);
//    }

//    @PostConstruct
//    public void print() {
////        System.out.println("Env.my.height = " + environment.getProperty("my.height"));
////        System.out.println("ApplicationContext.my.height = " + context.getEnvironment().getProperty("my.height"));
////        System.out.println("ConfigurationProperties.my.height = " + customProperties.getHeight());
//
//        System.out.println("height = " + height);
//        System.out.println("[customProperties] height = " + customProperties.getHeight());
//    }

    @EventListener(ApplicationReadyEvent.class)
    public void print() {

        System.out.println("height = " + height);
        System.out.println("[customProperties] height = " + customProperties.getHeight());


        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("fred");
        studentService.printStudent("cassie");
        studentService.printStudent("cassie");
    }
}

