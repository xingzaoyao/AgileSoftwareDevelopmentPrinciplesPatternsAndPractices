package ppp.ch7;

public class Plane implements Transportation {
    @Override
    public void move() {
        System.out.println("飞机启动了");
    }
}
