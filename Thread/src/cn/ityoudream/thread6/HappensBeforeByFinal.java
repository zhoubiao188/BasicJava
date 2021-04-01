package cn.ityoudream.thread6;

/**
 * final 造成的溢出
 */
public class HappensBeforeByFinal {
    final int x;
    Object obj = null;
    int y;
    public HappensBeforeByFinal() {
        x = 3;
        y = 4;
        obj = this;
    }

    public static void main(String[] args) {
        HappensBeforeByFinal join = new HappensBeforeByFinal();
        System.out.println(join.obj);
    }
}
