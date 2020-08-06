package io.yovelas.finery;

import io.yovelas.Entity.Person;

public class Finery {

    private Person person;

    public void decorator(Person person){
        this.person = person;
    }

    void show() {
    }
}
