package io.yovelas.common.array.demo;

import io.yovelas.common.math.demo.MathDemo;

/**
 * @Classname ArrayDemo
 * @Description TODO
 * @Date 2020/9/25 12:02
 * @Created by dykewer
 */

public class ArrayDemo {

    public static void main(String[] args) {

        ArrayDemo current = new ArrayDemo();


        // 1. 找出数组中的最大值
        int[] arr1 = { 5, 15, 30, 20, 10000, 30, 35 };
        int max1 = arr1[0];
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max1) {
                max1 = arr1[i];
            }
        }
        System.out.printf("数组arr1中的最大值:%d\n",max1);


        // 2. 找出数组中的最小值
        int[] arr2 = { 5, 15, 30, 20, 10000, -20, 30, 35 };
        int min1 = arr2[0];
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        for (int i = 1; i < arr2.length; i++) {
            // 如果当前元素，比min更小，则换人
            if (arr2[i] < min1) {
                min1 = arr2[i];
            }
        }
        System.out.printf("数组arr2中的最小值:%d\n",min1);


        // 3. 反转数组
        int[] arr3 = { 10, 20, 30, 40, 50 };
        /*
        初始化语句：int min = 0, max = array.length - 1
        条件判断：min < max
        步进表达式：min++, max--
        循环体：用第三个变量倒手
         */
        for (int min = 0, max = arr3.length - 1; min < max; min++, max--) {
            int temp = arr3[min];
            arr3[min] = arr3[max];
            arr3[max] = temp;
        }
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.print("数组arr3反转后:");
        // 再次打印遍历输出数组后来的样子
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+",");
        }
        System.out.print("\n");

    }

}
