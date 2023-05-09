package com.example.patronfacade.clases;

import java.util.List;

public interface IPersonService {

    List<Person> findAll();
    void save (Person person);

}
