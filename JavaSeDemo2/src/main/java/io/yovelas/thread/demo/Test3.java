package io.yovelas.thread.demo;

/**
 * 多线程的两种实现方式
 */
public class Test3 {

    public static void main(String[] args) {

        /**
         * 多线程实现方式1
         * 继承Thread，并重写run方法
         * 可以直接使用Thread类中的方法，代码简单
         * 如果已经有了父类，就不能用这种方法
         */

        // 创建MyThreadOne对象
        MyThreadOne myThreadOne = new MyThreadOne();
        // 开启线程
        myThreadOne.start();

        /**
         * 多线程实现方式2
         * 实现Runnable接口，实现run方法
         * 即使自己定义的线程有了父类也可以实现接口，而且接口是可以多实现的
         * 不能直接使用Thread中的方法需要先获取到线程对象后，才能得到Thread的方法，代码复杂
         */

        // 创建MyThreadTwo对象
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        // 将其当作参数传 递给Thread
        Thread threadTwo = new Thread(myThreadTwo);
        // 开启线程
        threadTwo.start();

        // 主线程中同时执行的任务
        for(int i = 0; i < 5; i++) {
            System.out.println("MainThread");
        }

    }
}

/**
 * 定义类继承Thread
 */
class MyThreadOne extends Thread{

    /**
     * 重写 run 方法
     */
    @Override
    public void run() {
        super.run();
        // 在当前线程中执行的任务
        for(int i = 0; i < 5; i++) {
            System.out.println("MyThreadOne");
        }
    }
}

/**
 * 定义类实现Runnable接口
 */
class MyThreadTwo implements Runnable {

    /**
     * 重写 run 方法
     */
    @Override
    public void run() {
        // 在当前线程中执行的任务
        for(int i = 0; i < 5; i++) {
            System.out.println("MyThreadTwo");
        }
    }
}
