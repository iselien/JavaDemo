package io.yovelas.pattern.adpater;

public class AbstraoAdpater implements Voltage{
    @Override
    public int output5() {
        return 5;
    }

    @Override
    public int output9() {
        return 0;
    }

    @Override
    public int output12() {
        return 0;
    }
}
