package io.yovelas.thread.demo;

public class Test2 {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread("subThrad");
//        myThread.start();

        ImplRannable implRannable1 = new ImplRannable();
        ImplRannable implRannable2 = new ImplRannable();
        ImplRannable implRannable3 = new ImplRannable();
        new Thread(implRannable1).start();

        new Thread(implRannable2).start();
        new Thread(implRannable3).start();

    }

//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++) {
//                    System.out.println("runnable在执行：" + i);
//                }
//            }
//        };
//
//        new Thread(runnable).start();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main在执行：" + i);
//        }
//
//    }
}
