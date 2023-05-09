package com.example.patronsingleton.clases;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Person {
    private String name;
    private int age;
    private static final Person INSTANCE = new Person();

    public Person() {
        // Constructor vacío requerido por Spring Boot
    }

    public static Person getInstance() {
        return INSTANCE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters y Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
