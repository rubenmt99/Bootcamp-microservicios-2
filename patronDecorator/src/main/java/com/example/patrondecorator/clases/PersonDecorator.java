package com.example.patrondecorator.clases;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonDecorator implements IPerson{

    private IPerson person;

    private String description;


    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public Integer getAge() {
        return person.getAge();
    }

    public String getDescription() {
        return description;
    }
}
