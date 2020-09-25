package io.yovelas.thread.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ImplRannable implements Runnable {
    private int ticket = 100;
    Integer[] arr = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300};
    List list = new ArrayList();
    Random r = new Random();


    public ImplRannable() {
        list.addAll(Arrays.asList(arr));
    }

    /*
     * 执行卖票操作
     */
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + list);
        r.nextInt();


    }
}