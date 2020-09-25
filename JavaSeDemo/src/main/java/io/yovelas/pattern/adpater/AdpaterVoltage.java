package io.yovelas.pattern.adpater;

public class AdpaterVoltage extends Voltage200 implements Voltage5 {

    @Override
    public int output5() {
        return output200()/44;
    }
}
