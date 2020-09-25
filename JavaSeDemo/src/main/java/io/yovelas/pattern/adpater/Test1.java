package io.yovelas.pattern.adpater;

public class Test1 extends AbstraoAdpater{
    public static void main(String[] args) {
        System.out.println(new Test1().output5());
    }

    @Override
    public int output5() {
       return 5;
    }
}
