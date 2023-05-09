package com.example.bootcampretospring.clases;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {

    @Bean()
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person singletonPerson() {
        return new Person("Ruben", 24);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person prototypePerson(){
        return new Person("Antonio",35);
    }

}
