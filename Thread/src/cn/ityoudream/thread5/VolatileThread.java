package cn.ityoudream.thread5;

/**
 * 例如下面的示例代码，假设线程 A 执行 writer() 方法，按照 volatile 语义，会把变量
 * “v=true” 写入内存；假设线程 B 执行 reader() 方法，同样按照 volatile 语义，线程 B
 * 会从内存中读取变量 v，如果线程 B 看到 “v == true” 时，那么线程 B 看到的变量 x 是
 * 多少呢？
 */
public class VolatileThread {
    static int x = 0;
    static volatile boolean v = false;

    public void writer() {
        x = 42;
        v = true;
    }

    public void reader() {
        if (v == true) {
            System.out.println("x ->" + x);
        }
    }
}
