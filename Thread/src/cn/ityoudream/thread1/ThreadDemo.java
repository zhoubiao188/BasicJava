package cn.ityoudream.thread1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        //实现方式一(调用方式一)
//        new MyThread().start();
        //实现方式一(调用方式二)
//        Thread t1 = new Thread( new MyThread());
//        t1.start();
        //实现方式二
//        MyRunnable runnable = new MyRunnable();
//        new Thread(runnable).start();

       // 实现方式三
        FutureTask<Integer> call = new FutureTask<Integer>(new MyCallThread());
        new Thread(call).start();
        System.out.println(call.get());
    }
}
