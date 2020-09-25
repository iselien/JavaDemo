package io.yovelas.pattern.adpater;

public class Test {

    public static void main(String[] args) {
        charging(new AdpaterVoltage());
    }

    public static void charging(Voltage5 voltage5){
        System.out.println(voltage5.output5());
    }
}
