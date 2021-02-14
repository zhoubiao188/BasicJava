package cn.ityoudream.thread1;

import java.util.concurrent.Callable;

/**
 * 实现了Callable接口，覆写Callable中的call方法
 */
public class MyCallThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        return sum;
    }
}
