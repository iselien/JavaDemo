package io.yovelas;

public class ConcreteColleageue2 extends Colleague{
    public ConcreteColleageue2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notify(String message){
        System.out.println("同事2得到信息" + message);
    }
}
