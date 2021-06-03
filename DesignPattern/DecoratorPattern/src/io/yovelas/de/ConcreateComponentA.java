package io.yovelas.de;

public class ConcreateComponentA extends Decorator{

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰A的操作");
    }
}
