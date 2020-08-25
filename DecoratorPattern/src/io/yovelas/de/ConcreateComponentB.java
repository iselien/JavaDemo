package io.yovelas.de;

public class ConcreateComponentB extends Decorator{

    @Override
    public void operation() {
        super.operation();
        System.out.println("具体装饰B的操作");
    }
}
