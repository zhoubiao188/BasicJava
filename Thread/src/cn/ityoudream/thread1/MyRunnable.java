package cn.ityoudream.thread1;

/**
 * 实现方式二，实现Runnable接口，复写run方法
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
        }
    }
}
