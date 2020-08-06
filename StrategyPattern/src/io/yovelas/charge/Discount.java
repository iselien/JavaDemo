package io.yovelas.charge;

/** 返利 */
public class Discount implements Charge{

    private double moneyCondition = 0.0;
    private double moneyReturn = 0.0;

    public Discount(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double accept(double money) {
        double result = money;
        if (money >= moneyCondition){
            result = money - Math.floor(money /moneyCondition) * moneyReturn;
        }
        return result;
    }
}
