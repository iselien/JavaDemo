package io.yovelas.thread.demo;


public class ThreadDemo {


    public static void main(String[] args) {
//        MyThread myThread = new MyThread("subThrad");
//        myThread.start();

        ImplRannable implRannable1 = new ImplRannable();
        ImplRannable implRannable2 = new ImplRannable();
        ImplRannable implRannable3 = new ImplRannable();
        new Thread(implRannable1).start();
        new Thread(implRannable2).start();
        Thread thread = new Thread(implRannable3);
        thread.setName("aaserf");
        thread.start();
        System.err.println(thread.getName());

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


    /**
     * 什么是线程
     * 线程是程序执行的一条路径，一个进程中可以包含多条线程
     * 多线程并发执行可以提高程序的效率，可以同时完成多项工作
     *
     * 多线程并行和并发的区别
     * 并行就是两个任务同时运行，就是甲任务进行的同时，乙任务也在进行。(需要多核CPU)
     * 并发是指两个任务都请求运行，而处理器只能接受一个任务，就把两个任务安排轮流进行，由于时间间隔较短，使人感觉两个任务都在运行。
     *
     * 多线程实现方式2
     *
     * 实现Runnable接口，实现run方法
     *
     * 获取线程名字，通过getNate()方法获取线程对象的名字
     * 设置名字，通过构造函数可以传入String类型的名字
     *
     *
     */


    public void tt(){
        System.out.println("aaa");
    }



}
