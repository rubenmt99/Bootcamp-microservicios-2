package com.example.patronbuilder;

import com.example.patronbuilder.clases.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronBuilderApplication.class, args);
        Person person1 = new Person.Builder("Rubén Matías", 24).build();
        Person person2 = new Person.Builder("Luis Rodriguez", 40).build();

        System.out.println("Person 1: " + person1.getName() + " - " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + " - " + person2.getAge());
    }

}
