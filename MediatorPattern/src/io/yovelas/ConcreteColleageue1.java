package io.yovelas;

public class ConcreteColleageue1 extends Colleague{
    public ConcreteColleageue1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事1得到信息" + message);
    }
}
