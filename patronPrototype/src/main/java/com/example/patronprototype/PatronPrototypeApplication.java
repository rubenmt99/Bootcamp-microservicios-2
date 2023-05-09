package com.example.patronprototype;

import com.example.patronprototype.clases.Person;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class PatronPrototypeApplication {


    public static void main(String[] args) throws CloneNotSupportedException {
        GenericApplicationContext context = new GenericApplicationContext();
        // Registramos la clase Person como un bean en el contexto
        context.registerBean(Person.class, Person::new);
        context.refresh(); // Llamada al método refresh() para inicializar el contexto

        // Obtenemos una instancia de Person del contexto
        Person person1 = context.getBean(Person.class);
        person1.setName("John");
        person1.setAge(30);
        System.out.println("Person 1 name: " + person1.getName());
        System.out.println("Person 1 age: " + person1.getAge());

        Person person2 = context.getBean(Person.class);
        person2.setName("Alice");
        person2.setAge(25);
        System.out.println("Person 2 name: " + person2.getName());
        System.out.println("Person 2 age: " + person2.getAge());

        Person person3 = (Person) person2.clone();
        System.out.println("Persona clonada: " + person3.getName() + " - " + person3.getAge());
    }
}


