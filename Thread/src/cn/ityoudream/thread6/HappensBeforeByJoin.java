package cn.ityoudream.thread6;

/**
 * 线程 join() 规则
 */
public class HappensBeforeByJoin {
    static int x = 9527;
    public static void main(String[] args) throws InterruptedException {
        Thread B = new Thread(() -> {
            //此处对x这个共享变量的修改
            x = 520;
        });
        // 例如此处对共享变量修改
        // 则这个修改结果对线程 B 可见
        // 主线程Main启动子线程
        B.start();
        B.join();
        System.out.println("x:" + x);
        // 子线程B所有对共享变量的修改
        // 在主线Main程调用 B.join() 之后皆可见
        // 此例中，var == 520
    }
}
