package io.yovelas;

import io.yovelas.operation.Operation;
import io.yovelas.operation.OperationFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入数字:");
        int numberA = scanner.nextInt();

        System.out.print("请输入选择运算符号(+,-,*,/):");
        String operate = scanner.next();

        System.out.print("请输入数字:");
        int numberB = scanner.nextInt();

        Operation operation = OperationFactory.createOperation(operate);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        
        System.out.println("结果是：" + operation.getResult());
    }
}
