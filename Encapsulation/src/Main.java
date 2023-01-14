public class Main {
    public static void main(String[] args)
    {
        Street street = new Street();
        street.setnamestreet1("Yew Route");
        street.setnamestreet2("Oak Lane");
        street.setnamestreet3("Campus Way");
        System.out.println("This city has the following streets: " + street.getnamestreet1() + ", " + street.getnamestreet2() + ", " + street.getnamestreet3() + ".");

    }
}