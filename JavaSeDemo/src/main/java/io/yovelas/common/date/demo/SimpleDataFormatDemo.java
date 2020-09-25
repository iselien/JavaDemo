package io.yovelas.common.date.demo;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Classname SimpleDataFormatDemo
 * @Description Date������/ʱ���ʽ������ĳ����࣬�����������޹ظ�ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������
 * @Date 2020/9/25 16:34
 * @Created by dykew
 */

public class SimpleDataFormatDemo {

    public static void main(String[] args) {
        // SimpleDataFormat() ʹ��Ĭ�ϵ�ģʽ��Ĭ�����Ի������ڸ�ʽ���Ź���SimpleDateFormat
        // SimpleDataFormat(String pattern) �ø�����ģʽ��Ĭ�����Ի��������ڸ�ʽ���Ź���

        // format(Date date) ��һ��Dateת��ΪString
        // Dateparse(String source) ��һ��Stringת��ΪDate

        long time = System.currentTimeMillis();
        Date date = new Date(time);
        System.out.println(date.toString());
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        // ���� format ���������ڶ�����и�ʽ������Ĭ�Ϸ��
        String str_date = dateFormat.format(date);
        System.out.println(str_date);
    }
}
