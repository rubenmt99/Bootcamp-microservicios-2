package com.example.patronsingleton;

import com.example.patronsingleton.clases.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronSingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronSingletonApplication.class, args);


        Person person1 = Person.getInstance();
        person1.setName("Ruben Matías");
        person1.setAge(24);

        Person person2 = Person.getInstance();

        System.out.println("Person 1 Nombre: " + person1.getName());
        System.out.println("Person 1 Edad: " + person1.getAge());
        System.out.println("Person 2 Nombre: " + person2.getName());
        System.out.println("Person 2 Edad: " + person2.getAge());

        System.out.println("Person 1 == Person 2? " + (person1 == person2));
    }

}
