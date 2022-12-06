package ppp.ch7;

public class Car implements Transportation{
    @Override
    public void move() {
        System.out.println("汽车启动了");
    }
}
