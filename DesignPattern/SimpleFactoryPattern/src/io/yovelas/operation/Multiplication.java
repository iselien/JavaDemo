package io.yovelas.operation;

public class Multiplication extends Operation{
    @Override
    public int getResult() {
        return getNumberA() * getNumberB();
    }
}
