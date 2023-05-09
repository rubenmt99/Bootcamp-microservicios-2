package com.example.patronfacade.clases;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements  IPersonService{

    private List<Person> listaPersonas = new ArrayList<>();

    public PersonServiceImpl(){
        listaPersonas.add(new Person("Sofía",17));
        listaPersonas.add(new Person("Antonio",22));
        listaPersonas.add(new Person("Pedro",27));
    }

    @Override
    public List<Person> findAll() {
        return listaPersonas;
    }

    @Override
    public void save(Person person) {
        listaPersonas.add(person);
    }
}
