package io.yovelas.common.string.demo;

/**
 * @Classname StringBufferDemo
 * @Description TODO
 * @Date 2020/9/25 15:57
 * @Created by dykew
 */

public class StringBufferDemo {

    /**
     * StringBuffer是字符串变量，它的对象是可以扩充和修改的。它是线程安全的可变字符序列。
     */

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);

        // 返回当前容量
        System.out.println(sb1.capacity());

        // 返回长度
        System.out.println(sb1.length());

        // append(String str) 可以把任意类型数据加到字符串缓冲区里面，并返回字符串缓冲区本身
        // insert(int offset, String str) 在指定位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身

        // 删除功能
        // deleteCharAt(int index) 删除指定位置的字符，并返回本身
        // delete(int start, int end) 删除从指定位置开始指定位置结束的内容，并返回本身

        // 替换和反转功能
        // replace(int start, int end, String str) 从start开始到end用str替换

        // 反转功能
        // reverse() 字符串反转

        // 截取功能
        // substring(int start) 从指定位置截取到未尾
        // substring(int start, int end) 截取从指定位置开始到结束位置，包括开始位置，不包括结束位置




    }
}
