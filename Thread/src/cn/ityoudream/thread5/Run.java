package cn.ityoudream.thread5;

public class Run {
    public static void main(String[] args) {
        //启动写线程A
        HandleA a = new HandleA();
        Thread A = new Thread(a);
        //启动度线程B
        HandleB b = new HandleB();
        Thread B = new Thread(b);
        /**
         * 如果在低于 1.5 版
         * 本上运行，x 可能是 42，也有可能是 0；如果在 1.5 以上的版本上运行，x 就是等于 42。
         */
        A.start();
        B.start();
    }
}
