package cn.ityoudream.thread7;

/**
 * 对get() 也进行加锁，解决get获取value不正确
 */
public class SafeCalc2 {
    long value = 0l;
    synchronized long get() {
        return value;
    }

    synchronized void addOne() {
        value += 1;
    }

    public static void main(String[] args) {
        SafeCalc2 safeCalc2 = new SafeCalc2();
        for (int i = 0; i < 1000 ; i++) {
            Thread t1 = new Thread(() -> {
                safeCalc2.addOne();
            });
            t1.start();
            System.out.println(safeCalc2.get());

        }
    }
}
