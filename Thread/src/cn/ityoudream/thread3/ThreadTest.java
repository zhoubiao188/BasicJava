package cn.ityoudream.thread3;

public class ThreadTest {
    private static long count = 0;
    private void add10K() {
        int idx = 0;
        while (idx++ < 10000) {
            count +=1;
        }
    }

    public static long calc() throws InterruptedException {
        final ThreadTest test = new ThreadTest();
        //创建两个线程执行add()操作
        Thread t1 = new Thread(() -> {
            test.add10K();
        });
        Thread t2 = new Thread(() -> {
            test.add10K();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        return count;
    }

    public static void main(String[] args) {
        try {
            long calc = ThreadTest.calc();
            System.out.println("result:" + calc);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}
