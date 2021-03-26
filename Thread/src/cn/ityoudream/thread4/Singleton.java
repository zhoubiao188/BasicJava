package cn.ityoudream.thread4;

/**
 * 在获取实
 * 例 getInstance() 的方法中，我们首先判断 instance 是否为空，如果为空，则锁定
 * Singleton.class 并再次检查 instance 是否为空，如果还为空则创建 Singleton 的一个实
 * 例。
 */
public class Singleton {
    static Singleton instance;
    static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
