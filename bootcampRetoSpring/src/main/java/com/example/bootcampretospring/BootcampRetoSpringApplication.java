package com.example.bootcampretospring;

import com.example.bootcampretospring.clases.Person;
import com.example.bootcampretospring.clases.PersonConfig;
import com.example.bootcampretospring.clases.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class BootcampRetoSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(BootcampRetoSpringApplication.class, args);
        PersonService personService = app.getBean(PersonService.class);
        personService.testBuilder();
        personService.testSingleton();
        personService.testPrototype();

        app.close();
    }

}
