package cn.ityoudream.thread1;

public class ThreadDemo {
    public static void main(String[] args) {
//        //实现方式一(调用方式一)
//        new MyThread().start();
        //实现方式一(调用方式二)
//        Thread t1 = new Thread( new MyThread());
//        t1.start();
        //实现方式二
        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();
    }
}
