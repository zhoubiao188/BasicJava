package cn.ityoudream.thread7;

/**
 * 用 synchronized 解决 count+=1 问题
 */
public class SafeCalc {
    long value = 0l;
    long get() {
        return value;
    }

    synchronized void addOne() {
        value += 1;
    }

    public static void main(String[] args) {
        SafeCalc safeCalc = new SafeCalc();
        for (int i = 0; i < 1000; i++) {
           Thread t1 = new Thread(()-> {
               safeCalc.addOne();
           });
            t1.start();
            System.out.println(safeCalc.get());
        }
    }
}
