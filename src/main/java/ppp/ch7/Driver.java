package ppp.ch7;

public class Driver {
    public void start(Transportation transportation) {
         transportation.move();
    }

    public static void main(String[] args) {
        Car car = new Car();
        Driver driver = new Driver();
        driver.start(car);
        KongKe kongKe = new KongKe();
        driver.start(kongKe);
    }
}
