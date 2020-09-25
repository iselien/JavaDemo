package io.yovelas.common.date.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Classname DateDemo
 * @Description Date类表示特定的瞬间，精确到毫秒
 * @Date 2020/9/25 11:17
 * @Created by dykew
 */

public class DateDemo {

    public static void main(String[] args) {

        // Date() 使用当前系统时间构造一个Date
        // Date(long date) 使用一个毫秒值构造一个Date

        // getTime() 获取毫秒值
        // setTime(long time) 设置毫秒值



        // 打印日期和时间
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt()-1900;
        int month = sc.nextInt()-1;
        int date = sc.nextInt();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd EEE hh:mm:ss").format(new Date(year,month,date)));

        System.out.println((Calendar.getInstance()).get(Calendar.MONTH)+1);

//		StringBuffer str1 = new StringBuffer("abc");
//		str1.reverse();
    }
}
