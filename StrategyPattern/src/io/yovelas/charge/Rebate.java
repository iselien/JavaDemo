package io.yovelas.charge;

/** 打折 */
public class Rebate implements Charge{

    private double moneyRebate = 1.0;

    public Rebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double accept(double money) {
        return money * moneyRebate;
    }
}
