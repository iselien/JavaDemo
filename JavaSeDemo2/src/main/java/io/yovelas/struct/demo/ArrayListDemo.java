package io.yovelas.struct.demo;

import java.util.ArrayList;

/**
 * @Classname ArrayListDemo
 * @Description TODO
 * @Date 2020/9/25 14:46
 * @Created by dykew
 */

public class ArrayListDemo {

    public static void main(String[] args) {

        // 创建了一个ArrayList集合
        ArrayList<String> list = new ArrayList<>();

        // 向集合当中添加一些数据，需要用到add方法。
        list.add("赵丽颖");
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        System.out.println(list); // [赵丽颖, 迪丽热巴, 古力娜扎, 玛尔扎哈]



//
//        ArrayList<String> list = new ArrayList<>();
//        System.out.println(list); // []
//
//        // 向集合中添加元素：add
//        boolean success = list.add("柳岩");
//        System.out.println(list); // [柳岩]
//        System.out.println("添加的动作是否成功：" + success); // true
//
//        list.add("高圆圆");
//        list.add("赵又廷");
//        list.add("李小璐");
//        list.add("贾乃亮");
//        System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 李小璐, 贾乃亮]
//
//        // 从集合中获取元素：get。索引值从0开始
//        String name = list.get(2);
//        System.out.println("第2号索引位置：" + name); // 赵又廷
//
//        // 从集合中删除元素：remove。索引值从0开始。
//        String whoRemoved = list.remove(3);
//        System.out.println("被删除的人是：" + whoRemoved); // 李小璐
//        System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 贾乃亮]
//
//        // 获取集合的长度尺寸，也就是其中元素的个数
//        int size = list.size();
//        System.out.println("集合的长度是：" + size);
//
//
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("迪丽热巴");
//        list.add("古力娜扎");
//        list.add("玛尔扎哈");

//        // 遍历集合
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }


    }
}
