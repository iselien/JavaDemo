package io.yovelas.finery;

import io.yovelas.Entity.Person;

public class Finery extends Person{

    private Person person;

    public void decorator(Person person){
        this.person = person;
    }

    @Override
    public void show() {
        if(person != null){
            person.show();
        }
    }
}
