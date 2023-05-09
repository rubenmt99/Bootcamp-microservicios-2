package com.example.bootcampretospring.clases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonConfig personConfig;

    public void testBuilder() {
        Person person1 = Person.builder().name("Juan").age(52).build();
        System.out.println("Persona 1 creada con Builder: " + person1.getName() + " , " + person1.getAge());
    }

    public void testSingleton() {
        Person person1 = personConfig.singletonPerson();
        Person person2 = personConfig.singletonPerson();
        System.out.println("Persona singleton: "+ person1.getName() + " , " + person1.getAge());
        System.out.println("Singleton test (son la misma instancia): " + (person1 == person2));
    }

    public void testPrototype() {
        Person person1 = personConfig.prototypePerson();
        Person person2 = personConfig.prototypePerson();
        System.out.println("Persona prototype: "+ person1.getName() + " , " + person1.getAge());
        System.out.println("Prototype test (son la misma instancia): " + (person1 == person2));
    }

}
