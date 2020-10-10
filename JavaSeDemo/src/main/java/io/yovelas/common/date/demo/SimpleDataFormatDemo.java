package io.yovelas.common.date.demo;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Classname SimpleDataFormatDemo
 * @Description Date是日期/时间格式化子类的抽象类，它以与语言无关格式化并解析日期或时间。是抽象类，所以使用其子类
 * @Date 2020/9/25 16:34
 * @Created by dykew
 */

public class SimpleDataFormatDemo {

    public static void main(String[] args) {
        // SimpleDataFormat() 使用默认的模式和默认语言环境日期格式符号构造SimpleDateFormat
        // SimpleDataFormat(String pattern) 用给定的模式和默认语言环境的日期格式符号构造

        // format(Date date) 将一个Date转换为String
        // Dateparse(String source) 将一个String转换为Date

        long time = System.currentTimeMillis();
        Date date = new Date(time);
        System.out.println(date.toString());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        // 调用 format 方法对日期对象进行格式化。用默认风格。
        String str_date = dateFormat.format(date);
        System.out.println(str_date);
    }
}
