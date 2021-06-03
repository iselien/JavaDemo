package io.yovelas;

import io.yovelas.charge.Context;
import io.yovelas.charge.Discount;
import io.yovelas.charge.Normal;
import io.yovelas.charge.Rebate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static double total = 0.0;
    static List<String> list = new ArrayList();

    public static void main(String[] args) {
        add(9, 5);
        add(4, 2);
        add(28, 9);

        for (String s : list){
            System.out.println(s);
        }

        // 折扣方式
        Context context = new Context(new Discount(300,100));
        double accept = context.accept(800);
        System.out.println(accept);


    }

    public static void add(double price, int numbers){
        total += price * numbers;
        list.add("单价:" + price + "\t\t\t\t数量:" + numbers + "\t\t\t合计:" + price * numbers);
    }
}
