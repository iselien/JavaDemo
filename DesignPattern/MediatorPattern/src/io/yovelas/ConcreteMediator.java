package io.yovelas;

public class ConcreteMediator extends Mediator{

    private ConcreteColleageue1 colleageue1;
    private ConcreteColleageue2 colleageue2;


    public void setColleageue1(ConcreteColleageue1 colleageue1) {
        this.colleageue1 = colleageue1;
    }

    public void setColleageue2(ConcreteColleageue2 colleageue2) {
        this.colleageue2 = colleageue2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == colleageue1){
            colleageue2.notify(message);
        }else {
            colleageue1.notify(message);
        }

    }
}
