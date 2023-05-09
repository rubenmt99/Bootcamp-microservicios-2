package com.example.patronfacade;

import com.example.patronfacade.clases.Person;
import com.example.patronfacade.clases.PersonFacade;
import com.example.patronfacade.clases.PersonServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PatronFacadeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatronFacadeApplication.class, args);

        // Crear una instancia de PersonRepository
        PersonServiceImpl personService = new PersonServiceImpl();

        // Crear una instancia de PersonFacade
        PersonFacade personFacade = new PersonFacade(personService);

        // Obtener las personas entre 20 y 30 años y mostrarlas por consola
        List<Person> personsBetween20And30 = personFacade.personasEntre20y30();

        personsBetween20And30.stream().forEach(System.out::println);

    }

}
