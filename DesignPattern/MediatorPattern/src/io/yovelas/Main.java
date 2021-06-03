package io.yovelas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("aaa");

        ConcreteMediator m = new ConcreteMediator();

        ConcreteColleageue1 c1 = new ConcreteColleageue1(m);
        ConcreteColleageue2 c2 = new ConcreteColleageue2(m);

        m.setColleageue1(c1);
        m.setColleageue2(c2);

        c1.send("hello");
        c2.send("hellouuu");

    }
}
