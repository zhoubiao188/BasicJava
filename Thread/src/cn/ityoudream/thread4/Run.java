package cn.ityoudream.thread4;

public class Run {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.instance;
        System.out.println(instance);
        System.out.println(instance1);
    }
}
