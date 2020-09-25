package io.yovelas.common.string.demo;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Classname StringDemo
 * @Description String类的常用方法示例
 * @Date 2019/7/23 7:36
 * @Created by dykewer
 */

public class StringDemo {

	public static void main(String[] args) {

		StringDemo current = new StringDemo();


		// 1. 字符数组转换成字符串
		char[] charArray1 = { 'A', 'B', 'C' };
		String str1 = new String(charArray1);
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("字符数组转换成字符串:%s\n", str1);


		// 2. 字节数组转换成字符串
		byte[] byteArray1 = { 97, 98, 99 };
		String str2 = new String(byteArray1);
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("字节数组转换成字符串:%s\n", str2);


		// 3. 将字符串转换成Short
		String str3 = "200";
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("String转换成Short,String:%s -> Short:%s\n", str3, new Short(str3));


		// 4. 字符串转换成为字符数组
		String str4 = "Hello";
		char[] chars = str4.toCharArray();
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("String转换成char数组:%s\n", chars[0]);


		// 5. 转换成为字节数组
		String str5 = "Hello";
		byte[] bytes = str5.getBytes();
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.print("String转换成byte数组");
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i]+",");
		}
		System.out.println();



		// 4. 判断字符串是否为空
		String str6 = "abc";
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("String:%s,%s\n", str6, str6.isEmpty() ? "为空" : "不为空");


		// 5. 获取字符串中的第N个字符
		String str7 = "abc";
		int n1 = 3;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("获取'%s'中的第%d个字符:%s\n", str7, n1, str7.charAt(2));


		// 6. 获取指定区间的字符串
		String str8 = "someone like you love";
		int start1 = 3;
		int end1 = 8;
		System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
				Thread.currentThread().getStackTrace()[1].getLineNumber());
		System.out.printf("获取'%s'中的第%d到%d个字符:%s\n", str8, start1, end1, str8.substring(start1, end1));



		// 字符串的内容替换
//		String str1 = "How do you do?";
//		String str2 = str1.replace("o", "*");
//		System.out.println(str1); // How do you do?
//		System.out.println(str2); // H*w d* y*u d*?
//		System.out.println("==============");

		String lang1 = "会不会玩儿呀！你大爷的！你大爷的！你大爷的！！！";
		String lang2 = lang1.replace("你大爷的", "****");
		System.out.println(lang2); // 会不会玩儿呀！****！****！****！！！


		// 字符串分割
		String str10 = "aaa,bbb,ccc";
		String[] array1 = str10.split(",");
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("===============");




		// 6. 删除字符串中的第N个字符

		// 7. 在字符串未尾中追加指定字符

		// 8. 在字符串指定位置追加指定字符


		// 10. 删除指定区间的字符串

		// 11. 获取指定字符串的位置


		StringBuffer sb = new StringBuffer(" ab");
		System.out.println(sb);
		sb.append("追加");
		System.out.println(sb);
		// 删除下标为1的字符
		sb.deleteCharAt(1);
		System.out.println(sb);

		// 给字符串追加字符串"abcdefg"
		sb.append("abcdefg");

		// 获得字符串的长度
		System.out.println(sb.length());

		// 往下标1位置插入"我是插入的字符串"
		sb.insert(1, "我是插入的字符串");
		System.out.println(sb);

		// 删除下标2到下标5的字符
		sb.delete(2, 5);
		System.out.println(sb);

		// 获得下标3到下标6之间的字符串
		sb.substring(3,6);

		// 获得字符串"de"在字符串中的下标
		System.out.println(sb.indexOf("de"));


		// 打印出字符e字符串中的位置
		// 判断@是否出现在字符串中
		// 判断 字符串是否跟字符串"abcde"相同
		// 将字符串跟"我你他"连接起来concat()
		// 将字符串的"我"用"1"去代替
		// 将字符串用空格分割，分割后再进行遍历
		// 将字符串的def取出来 getChars() 开始下标，结束下标，
		// 将字符串转换为大写
		// 将字符串转换为小写
		// 将字符串进行清空

	}

}
