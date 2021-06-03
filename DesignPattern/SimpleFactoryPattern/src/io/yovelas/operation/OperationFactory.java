package io.yovelas.operation;

public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation = null;

        switch (operate){
            case "+" :
                operation = new Addition();
                break;
            case "-" :
                operation = new Subtraction();
                break;
            case "*" :
                operation = new Multiplication();
                break;
            case "/" :
                operation = new Division();
                break;
        }
        return operation;
    }
}
