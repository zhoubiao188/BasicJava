package cn.ityoudream.thread1;

/**
 * 用线程池的方式来实现线程
 */
public class ThreadPool implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
        }
    }
}
