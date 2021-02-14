package cn.ityoudream.thread1;

import java.util.concurrent.*;

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
//        FutureTask<Integer> call = new FutureTask<Integer>(new MyCallThread());
//        new Thread(call).start();
//        System.out.println(call.get());
        // 实现方式四
//        ThreadPoolStart();
        // 方式五
//        anonymousThread();
        // 方式六
//        LambdaThread.Thread1();
        // 方式七
//        LambdaThread.Thread2();
        //方式八
//        LambdaThread.Thread3();
    }

    /**
     * 线程池
     */
    public static void ThreadPoolStart() {
        //创建一个容量大小为5的线程池
        ExecutorService pool = Executors.newFixedThreadPool(6);
        ThreadPoolExecutor executor = (ThreadPoolExecutor)pool;
        executor.setCorePoolSize(5);
        //开启线程
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());
        executor.execute(new ThreadPool());
    }

    /**
     * 匿名内部类
     */
    public static void anonymousThread() {
        new Thread() {
            //直接实现run方法
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("ThreadName:" + Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}
