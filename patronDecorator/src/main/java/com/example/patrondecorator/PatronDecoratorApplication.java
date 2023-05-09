package com.example.patrondecorator;

import com.example.patrondecorator.clases.IPerson;
import com.example.patrondecorator.clases.Person;
import com.example.patrondecorator.clases.PersonDecorator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatronDecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronDecoratorApplication.class, args);

        IPerson person = new Person("Rubén",24);

        IPerson decoratedPerson = new PersonDecorator(person, "Esta es mi descripción");

        System.out.println("Nombre: " + decoratedPerson.getName());
        System.out.println("Edad: " + decoratedPerson.getAge());
        System.out.println("Descripción: " + ((PersonDecorator) decoratedPerson).getDescription());

    }

}
