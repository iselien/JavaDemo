package io.yovelas.thread.demo;

public class MyThread extends Thread {
    public static Object obj = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println(Thread.currentThread().getName() + ":获取锁对象");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + ":唤醒");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                        System.out.println("等待三秒");
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    synchronized (obj){
                        System.out.println(Thread.currentThread().getName() + "获取锁对象");
                        obj.notify();
                    }
                }
            }
        },"唤醒线程").start();

    }

}
