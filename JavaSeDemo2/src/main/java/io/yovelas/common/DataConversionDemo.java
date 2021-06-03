package io.yovelas.common;

/**
 * @Classname DataConversionDemo
 * @Description TODO
 * @Date 2020/9/25 11:34
 * @Created by dykew
 */

public class DataConversionDemo {

    public static void main(String[] args) {

        // 自动转换：将取值范围小的类型自动提升为取值范围大的类型
        // 范围小的类型向范围大的类型提升，byte, short, char运算时直接提升为int
        int num1 = 1;
        byte num2 = 2;
        int num3 = num1 + num2;  // int和byte 运算将自动提升为int

        int num4 = 1;
        double num5 = 2.5;
        double num6 = num4 + num5;  // int和double运行将自动提升为double


        // 强制转换：将取值范围大的类型强制转换成取值范围小的类型
        // double类型内存8个字节，int类型内存4个字节。
        // 想要赋值成功，只有通过强制类型转换，将double类型强制转换成int。
        int num7 = (int)1.5; // double类型数据强制转换成int类型，直接去掉小数
        System.out.println(num7);

        short num8 = 2340;
        num8 = (short)(num8 + 10);  // int 强制转成short砍掉2个字节，可能造成数据丢失

    }


}
