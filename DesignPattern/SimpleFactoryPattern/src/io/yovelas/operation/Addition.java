package io.yovelas.operation;

public class Addition extends Operation{

    @Override
    public int getResult() {
        return getNumberA() + getNumberB();
    }
}
