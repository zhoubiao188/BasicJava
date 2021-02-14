package cn.ityoudream.thread1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Lambda实现线程
 */
public class LambdaThread {
    /**
     * 普通线程，无返回值
     */
    public static void Thread1() {
        //这里面的代码就是run方法区域
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
            }
        }).start();
    }

    /**
     * 使用线程池实现异步线程
     */
    public static void Thread2() {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
            }
        });
    }

    /**
     * 使用线程池实现异步线程,可以返回参数
     */
    public static String Thread3() {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        Future<String> result = (Future<String>) pool.submit(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
            }
        });
        try {
            return result.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
