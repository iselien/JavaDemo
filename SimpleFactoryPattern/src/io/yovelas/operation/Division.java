package io.yovelas.operation;

public class Division extends Operation{
    @Override
    public int getResult() {
        return getNumberA() / getNumberB();
    }
}
