package io.yovelas.charge;

public class Context implements Charge{

    Charge charge;

    public Context(Charge charge) {
        this.charge = charge;
    }

    @Override
    public double accept(double money) {
        return charge.accept(money);
    }
}
