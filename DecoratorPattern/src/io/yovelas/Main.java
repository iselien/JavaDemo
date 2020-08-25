package io.yovelas;

import io.yovelas.Entity.Person;
import io.yovelas.finery.BigTrouser;
import io.yovelas.finery.TShirts;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.decorator(new Person("aa"));
//        bigTrouser.decorator(tShirts);
    }

}
