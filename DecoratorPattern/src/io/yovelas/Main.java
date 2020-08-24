package io.yovelas;

import io.yovelas.Entity.Person;
import io.yovelas.de.ConcreateComponent;
import io.yovelas.de.ConcreateComponentA;
import io.yovelas.de.ConcreateComponentB;
import io.yovelas.finery.BigTrouser;
import io.yovelas.finery.TShirts;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person = new Person("小菜");

        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        tShirts.decorator(person);
        bigTrouser.decorator(tShirts);
        bigTrouser.show();


        ConcreateComponent cc = new ConcreateComponent();
        ConcreateComponentA cca = new ConcreateComponentA();
        ConcreateComponentB ccb = new ConcreateComponentB();

        cca.setComponent(cc);
        ccb.setComponent(cca);
        ccb.operation();

    }
}
