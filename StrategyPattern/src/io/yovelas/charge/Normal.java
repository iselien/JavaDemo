package io.yovelas.charge;

/** 标准 */
public class Normal implements Charge{
    @Override
    public double accept(double money) {
        return money;
    }
}
