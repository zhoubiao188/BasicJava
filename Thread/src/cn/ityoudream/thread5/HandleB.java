package cn.ityoudream.thread5;

public class HandleB implements Runnable{
    @Override
    public void run() {
        //这里调用reader方法
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.reader();
    }
}
