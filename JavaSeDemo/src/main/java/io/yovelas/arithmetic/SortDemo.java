package io.yovelas.arithmetic;

/**
 * @Classname SortDemo
 * @Description TODO
 * @Date 2020/9/25 16:13
 * @Created by dykew
 */

public class SortDemo {

    public static void main(String[] args) {
        new SortDemo().bubbleSort();

    }

    /**
     * 冒泡排序
     */
    public void bubbleSort(){
        int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
        int temp=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public void SelectSort(int[] array) {
        int i, j, k;// 分别为有序区，无序区，无序区最小元素指针
        for (i = 0; i < array.length; i++) {
            k = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[k])
                    k = j;
            }
            if (k != i){ // 若发现最小元素，则移动到有序区
                int temp = array[k];
//                array[k] = array;
//                array = array[temp];
            }
        }
    }


    public static int branchSearch(int[] array, int searchNum) {
        if (array == null)
            throw new NullPointerException("Null Referrence");
        if (array.length == 0)
            throw new IllegalArgumentException("Array Length is Zero");
        int low = 0, high = array.length;
        int middle = (high + low) / 2;
        int index = -1;
        if (searchNum < array[0] || searchNum > array[array.length - 1])
            return index;
        while (middle >= 0) {
            if (array[middle] == searchNum) {
                index = middle;
                break;
            }
            if (searchNum > array[middle]) {
                low = middle;
            } else {
                high = middle;
            }
            middle = (low + high) / 2;
        }
        return index;
    }

}
