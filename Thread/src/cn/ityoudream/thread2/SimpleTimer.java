package cn.ityoudream.thread2;

/**
 * 实现简单的计时器sleep
 */
public class SimpleTimer {
    private static int count;
    public static void main(String[] args) {
        count = args.length >= 1 ? Integer.valueOf(args[0]) : 60;
        int remaining;
        while (true) {
            remaining = countDown();
            if (0 == remaining) {
                break;
            } else {
                System.out.println("remaining " + count + "second (s) *");
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex) {

            }
        }
        System.out.println("Done!");
    }

    private static int countDown() {
        return count --;
    }
}
