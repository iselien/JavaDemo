package io.yovelas.common.random.demo;

import java.util.Random;
import java.util.Scanner;

/**
 * @Classname RandomDemo
 * @Description TODO
 * @Date 2020/9/25 10:14
 * @Created by dykew
 */

public class RandomDemo {

    public static void main(String[] args) {

        // 获取一个随机int数字(范围是int所有范围，包括正负两种)
        int num1 = new Random().nextInt();

        // 获取指定区间随机数
        System.out.println(new Random().nextInt(100)); // 0~99


        // 猜数字游戏
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1; // [1,100]
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); // 键盘输入猜测的数字

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试。");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试。");
            } else {
                System.out.println("恭喜你，猜中啦！");
                break; // 如果猜中，不再重试
            }
        }

        System.out.println("游戏结束。");
    }
}
