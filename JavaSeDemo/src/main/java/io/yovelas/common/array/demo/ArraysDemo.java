package io.yovelas.common.array.demo;

import java.util.Arrays;

/**
 * @Classname ArraysDemo
 * @Description java.util.Arrays��һ����������صĹ����࣬�����ṩ�˴�����̬����������ʵ�����鳣���Ĳ���
 * @Date 2020/9/25 15:36
 * @Created by dykew
 */

public class ArraysDemo {
    public static void main(String[] args) {
        /**
         *  Arrays.toString(����)���������������ַ���������Ĭ�ϸ�ʽ��[Ԫ��1, Ԫ��2, Ԫ��3...]
         *  Arrays.sort(����)������Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������
         *  1. �������ֵ��sortĬ�ϰ��������С����
         *  2. ������ַ�����sortĬ�ϰ�����ĸ����
         *  3. ������Զ�������ͣ���ô����Զ��������Ҫ��Comparable����Comparator�ӿڵ�֧�֡�
         */

        int[] intArray = {10, 20, 30};
        // ��int[]���鰴��Ĭ�ϸ�ʽ����ַ���
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr); // [10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1)); // [1, 2, 3, 6, 10]

        String[] array2 = {"bbb", "aaa", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2)); // [aaa, bbb, ccc]


        String str = "asv76agfqwdfvasdfvjh";

        // ��ν����������У�sort
        // ������һ�����飬������Arrays.sort����
        // String --> ���飬��toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // ���ַ����������������

        // ��Ҫ�������
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }



    }
}
