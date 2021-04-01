package cn.ityoudream.thread7;

/**
 * synchronized 加锁的几种方式
 */
public class ThreadBySync {
    private Object object;

    public ThreadBySync(Object object) {
        this.object = object;
    }

    //修饰非静态方法
    synchronized void girl() {
        //临界区
    }///运行完毕自动释放锁
    //修饰静态方法
    synchronized void boy() {
        //临界区
    }//运行完毕自动释放锁

    //对对象或者当前对象加锁
    void oop1() {
        synchronized (this) {
            //临界区
        }
    }

    void oop2() {
        synchronized (object) {
            //临界区
        }
    }
}
