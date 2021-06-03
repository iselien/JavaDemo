package io.yovelas.operation;

public class Subtraction extends Operation{

    @Override
    public int getResult() {
        return getNumberA() - getNumberB();
    }
}
