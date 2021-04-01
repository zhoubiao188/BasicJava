package cn.ityoudream.thread6;

/**
 * 线程 start() 规则
 */
public class HappensBeforeByStart {
     static int x = 9527;
    public static void main(String[] args) {
        //main方法为主线程A
        Thread B = new Thread(() -> {
            //在主线程Main调用B.start()之前，所有共享变量的修改，此处可见
            if (x == 520) {
                System.out.println("可见");
            }
        });
        x = 520;
        B.start();
    }
}
