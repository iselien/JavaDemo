package io.yovelas.common.character.demo;

/**
 * @Classname CharDemo
 * @Description TODO
 * @Date 2020/9/25 10:08
 * @Created by dykew
 */

public class CharDemo {

    public static void main(String[] args) {

        CharDemo current = new CharDemo();

        // 1. 判断字符类型
        char ch1 = '5';
        char ch2 = 'a';
        char ch3 = 'b';
        char ch4 = 'C';
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.printf("字符'%s'是否为数字:%b\n", ch1, Character.isDigit(ch1));
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.printf("字符'%s'是否为字母:%b\n", ch2, Character.isLetter(ch2));
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.printf("字符'%s'是否为小写字母:%b\n", ch3, Character.isLowerCase(ch3));
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.printf("字符'%s'是否为大写字母:%b\n", ch4, Character.isUpperCase(ch4));


        // 2. 将小写字母转换成大写字母
        char ch5 = 'e';
        System.out.printf("\033[32;4m[%s,%s]\033[0m - ", current.getClass().getSimpleName(),
                Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.printf("小写字母'%s'被转成大写字母:%s\n", ch5, Character.toUpperCase(ch5));





    }

}
