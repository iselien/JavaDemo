package io.yovelas.common.string.demo;

/**
 * @Classname StringBufferDemo
 * @Description TODO
 * @Date 2020/9/25 15:57
 * @Created by dykew
 */

public class StringBufferDemo {

    /**
     * StringBuffer���ַ������������Ķ����ǿ���������޸ĵġ������̰߳�ȫ�Ŀɱ��ַ����С�
     */

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);

        // ���ص�ǰ����
        System.out.println(sb1.capacity());

        // ���س���
        System.out.println(sb1.length());

        // append(String str) ���԰������������ݼӵ��ַ������������棬�������ַ�������������
        // insert(int offset, String str) ��ָ��λ�ð��������͵����ݲ��뵽�ַ������������棬�������ַ�������������

        // ɾ������
        // deleteCharAt(int index) ɾ��ָ��λ�õ��ַ��������ر���
        // delete(int start, int end) ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���

        // �滻�ͷ�ת����
        // replace(int start, int end, String str) ��start��ʼ��end��str�滻

        // ��ת����
        // reverse() �ַ�����ת

        // ��ȡ����
        // substring(int start) ��ָ��λ�ý�ȡ��δβ
        // substring(int start, int end) ��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ã�����������λ��




    }
}
