package Bai3;

public class Test {
    public static void main(String[] args) {
        Point pt = new Point(2.3f, 6.3f);
        MovablePoint mpt = new MovablePoint();
        mpt.setX(3.2f);
        mpt.setY(4.6f);
        mpt.setXSpeed(1.2f);
        mpt.setYSpeed(3.4f);
        System.out.println(pt);
        System.out.println(mpt);
    }
}
