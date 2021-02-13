package cn.ityoudream.thread1;

/**
 * 实现方式一，继承Thread类，实现run方法
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
        }
    }
}
