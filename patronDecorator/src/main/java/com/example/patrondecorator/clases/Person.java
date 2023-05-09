package com.example.patrondecorator.clases;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements IPerson{

    private String name;

    private Integer age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
