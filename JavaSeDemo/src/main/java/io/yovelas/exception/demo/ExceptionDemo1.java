package io.yovelas.exception.demo;

/**
 * 计算⻓方形和圆形的面积。异常判断:数值不能小于等于0.
 * 1. 分类创建 Area, AreaException, Rectan
 * 1.建立4个类。
 * 2.这四个类分别是:MianJi类【接口】、YuanXing类、ChangFangXing 类、自定义异常类。
 * 3.自定义异常需要继承RuntimeException类，使机器停止运行。
 * 4.mianji类是抽象方法，实现类必须覆盖重写方法。
 * 5.@Ovewrride进行检测覆盖重写。
 */
public class ExceptionDemo1 {

    public static void main(String[] args) {

        // 计算长方形的面积
        Rectangle rectangle = new Rectangle(2,4);
        rectangle.area();

        // 计算圆形的面积
        Round round = new Round(2);
        round.area();
    }

}
