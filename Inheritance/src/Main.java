public class Main {
    public static void main(String[] args)
    {
        Transport transport = new Transport();
        transport.startEngine();
        Car car = new Car();
        car.isWipersOn = true;
        car.startEngine();
        car.startWipers();
    }
}