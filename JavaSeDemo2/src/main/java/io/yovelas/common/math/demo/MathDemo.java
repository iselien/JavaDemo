package io.yovelas.common.math.demo;

import java.util.Random;

/**
 * @Classname MathDemo
 * @Description TODO
 * @Date 2020/9/25 10:14
 * @Created by dykew
 */

public class MathDemo {

	public static void main(String[] args) {

		/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num)：获取绝对值。有多种重载。
public static double ceil(double num)：向上取整。
public static double floor(double num)：向下取整。
public static long round(double num)：四舍五入。

Math.PI代表近似的圆周率常量（double）。
 */

		MathDemo current = new MathDemo();


		// 1. 求一个数的绝对值
		int num1 = -39243;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("求'%d'的绝对值:%d\n",num1,Math.abs(num1));


		// 2. 求一个数的N次方
		int num2 = 2;
		int n1 = 4;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("求'%d'的%d次方:%e\n", num2, n1 ,Math.scalb(num2,n1));


		// 3. 求出大于或等于某数的最小整数
		double num3 = 4.8;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("求大于或等于'%f'的最小整数:%f\n", num3, Math.ceil(num3));


		// 4. 求出小于或等于某数的最大整数
		double num4 = 4.3;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("求大于或等于'%f'的最大整数:%f\n", num4, Math.floor(num4));

		// 5. 求出两个整数的最大值
		int num5 = 4;
		int num6 = 5;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("求整数'%d'和'%d'的最大值:%d\n", num5, num5, Math.max(num5, num6));


		// 6. 求出两个整数的最小值
		int num7 = 2;
		int num8 = 8;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("求整数'%d'和'%d'的最小值:%d\n", num7, num8, Math.max(num7, num8));



		// 获取绝对值
		System.out.println(Math.abs(3.14)); // 3.14
		System.out.println(Math.abs(0)); // 0
		System.out.println(Math.abs(-2.5)); // 2.5
		System.out.println("================");

		// 向上取整
		System.out.println(Math.ceil(3.9)); // 4.0
		System.out.println(Math.ceil(3.1)); // 4.0
		System.out.println(Math.ceil(3.0)); // 3.0
		System.out.println("================");

		// 向下取整，抹零
		System.out.println(Math.floor(30.1)); // 30.0
		System.out.println(Math.floor(30.9)); // 30.0
		System.out.println(Math.floor(31.0)); // 31.0
		System.out.println("================");

		System.out.println(Math.round(20.4)); // 20
		System.out.println(Math.round(10.5)); // 11


		/*
题目：
计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

分析：
1. 既然已经确定了范围，for循环
2. 起点位置-10.8应该转换成为-10，两种办法：
    2.1 可以使用Math.ceil方法，向上（向正方向）取整
    2.2 强转成为int，自动舍弃所有小数位
3. 每一个数字都是整数，所以步进表达式应该是num++，这样每次都是+1的。
4. 如何拿到绝对值：Math.abs方法。
5. 一旦发现了一个数字，需要让计数器++进行统计。

备注：如果使用Math.ceil方法，-10.8可以变成-10.0。注意double也是可以进行++的。
 */

		int count = 0; // 符合要求的数量

		double min = -10.8;
		double max = 5.9;
		// 这样处理，变量i就是区间之内所有的整数
		for (int i = (int) min; i < max; i++) {
			int abs = Math.abs(i); // 绝对值
			if (abs > 6 || abs < 2.1) {
				System.out.println(i);
				count++;
			}
		}

		System.out.println("总共有：" + count); // 9

	}
}
