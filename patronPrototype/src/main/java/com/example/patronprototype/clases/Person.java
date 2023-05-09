package com.example.patronprototype.clases;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Person implements Cloneable{
    private String name;
    private int age;

    // Implementación del método clone()
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
