public class Main {
    public static void main(String[] args)
    {
        City city = new City();
        city.setFirstStreet("Yew Route");
        city.setSecondStreet("Oak Lane");
        city.setThirdStreet("Campus Way");
        System.out.println("This city has the following streets: " + city.getFirstStreet() + ", " + city.getSecondStreet() + ", " + city.getThirdStreet() + ".");

    }
}