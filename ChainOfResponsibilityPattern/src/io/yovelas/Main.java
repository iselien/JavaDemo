package io.yovelas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("sss");

        ConcreteHandler1 ch1 = new ConcreteHandler1();
        ConcreteHandler2 ch2 = new ConcreteHandler2();
        ConcreteHandler3 ch3 = new ConcreteHandler3();

        ch1.setHandler(ch2);
        ch2.setHandler(ch3);

        ch1.handlerRequest(40);

    }
}
