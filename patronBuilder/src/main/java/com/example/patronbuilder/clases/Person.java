package com.example.patronbuilder.clases;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private Integer age;

    // Constructor privado para que la clase solo se pueda construir mediante el Builder
    private Person() {}


    public static class Builder {
        private String name;
        private int age;

    // Constructor con los valores obligatorios para crear una instancia de Person
        public Builder(String name, int age) {
             this.name = name;
             this.age = age;
            }

        // Construir una instancia de Person con los valores establecidos
        public Person build() {
            Person person = new Person();
            person.setName(this.name);
            person.setAge(this.age);
            return person;
        }
    }

}
