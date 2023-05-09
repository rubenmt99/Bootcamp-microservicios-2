package com.example.patronfacade.clases;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonFacade {

    private final IPersonService personService;

    public PersonFacade(IPersonService personService) {
        this.personService = personService;
    }


    public List<Person> personasEntre20y30(){
        return personService.findAll().stream().filter(p -> p.getAge() >= 20 && p.getAge() <= 30).collect(Collectors.toList());
    }

}
