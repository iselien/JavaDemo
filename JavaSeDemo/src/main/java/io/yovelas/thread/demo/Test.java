package io.yovelas.thread.demo;


public class Test {

    public static void main(String[] args) {
        ImplRannable implRannable = new ImplRannable();
        Thread thread = new Thread(implRannable);
        thread.setName("cc1");
        thread.start();


        Thread thread2 = new Thread(implRannable);
        thread2.setName("cc2");
        thread2.start();
    }
}
