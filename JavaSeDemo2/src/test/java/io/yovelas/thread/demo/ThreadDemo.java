package io.yovelas.thread.demo;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.CountDownLatch;

import static java.time.Duration.*;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class ThreadDemo {

    /**
     * 通过Thread构造函数可以传入线程名称
     * 通过getNate()方法获取线程名称
     */
    @Test
    public void threadNameTransmit(){

        new Thread("threadOne") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    // 通过getName获取线程的名称，并输出
                    System.out.println(this.getName() + "....thread running");
                }
            }
        }.start();

        new Thread("threadTwo") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    // 通过getName获取线程的名称，并输出
                    System.out.println(this.getName() + "....thread running");
                }
            }
        }.start();
    }

    /**
     * 通过setName()方法设置线程名称
     */
    @Test
    public void threadNameSet(){

        Thread threadOne = new Thread() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "....thread running");
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "....thread running");
                }
            }
        };
        threadOne.setName("threadOne");
        threadTwo.setName("threadTwo");
        threadOne.start();
        threadTwo.start();
    }

    /**
     * 获取当前线程
     */
    @Test
    public void getCurrentThread(){
        Thread thread = Thread.currentThread();
        System.out.printf("currentThread: %s\n",thread.getName());
    }

    /**
     * 线程休眠
     * 控制当前线程休眠若干毫秒
     * 1秒 = 1000毫秒 = 1000*1000*1000纳秒
     */
    @Test
    @Timeout(5)
    public void threadSleep() throws InterruptedException {
//        new CountDownLatch(1);

        CountDownLatch latch=new CountDownLatch(100);

//        assertTimeoutPreemptively(ofMinutes(10), () -> {
            // Simulate task that takes more than 10 ms.
        new Thread("threadOne") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        // 休眠100毫秒
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread("threadTwo") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        // 休眠100毫秒
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        latch.await();

//        });
    }


}
