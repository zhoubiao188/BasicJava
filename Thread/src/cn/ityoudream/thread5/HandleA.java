package cn.ityoudream.thread5;

public class HandleA implements Runnable{
    @Override
    public void run() {
        //这里调用writer方法
        VolatileThread volatileThread = new VolatileThread();
        volatileThread.writer();
    }
}
