package io.yovelas.thread.demo;

public class Test4 {

    public static void main(String[] args) {

        /**
         * 通过Thread构造函数可以传入线程名称
         * 通过getNate()方法获取线程名称
         */

        new Thread("threadOne") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "....thread running");
                }
            }
        }.start();

        new Thread("threadTwo") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "....thread running");
                }
            }
        }.start();

        /**
         * 通过setName()方法设置线程名称
         */

        Thread threadThree = new Thread() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "....thread running");
                }
            }
        };

        Thread threadFour = new Thread() {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(this.getName() + "....thread running");
                }
            }
        };
        threadThree.setName("threadThree");
        threadThree.setName("threadFour");
        threadThree.start();
        threadFour.start();

        /**
         * 获取当前线程
         */
        Thread thread = Thread.currentThread();
        System.out.printf("currentThread: %s\n",thread.getName());

        /**
         * 线程休眠
         * 控制当前线程休眠若干毫秒
         * 1秒 = 1000毫秒 = 1000*1000*1000纳秒
         */

        new Thread("threadFive") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        // 休眠100毫秒
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread("threadSix") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        // 休眠100毫秒
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        /**
         * 守护线程
         * setDaemon()设置一个线程为守护进程，该线程不会单独执行，当其他非守护线程都执行结束后，自动退出
         */

        Thread threadSeven = new Thread("threadSeven") {
            public void run() {
                for(int i = 0; i < 50; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread threadEight = new Thread("threadEight") {
            public void run() {
                for(int i = 0; i < 5; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        threadSeven.setDaemon(true);
        //将 threadSeven 设置为守护线程
        threadSeven.start();
        threadEight.start();

        /**
         * 加入线程
         * join(),当前线程暂停，等待指定的线程执行结束后，当前线程再继续
         * join(int),可以等待指定的毫秒之后继续
         */

        final Thread t1 = new Thread("threadNine") {
            public void run() {
                for(int i = 0; i < 50; i++) {
                    System.out.println(getName() + "...thread running");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread("threadTen") {
            public void run() {

                for(int i = 0; i < 50; i++) {
                    if(i == 2) {
                        try {
                            //t1.join();
                            // 插队,加入
                            t1.join(30);
                            //加入,有固定的时间,过了固定时间,继续交替执行
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName() + "...bb");
                }
            }
        };
        t1.start();
        t2.start();

    }
}
