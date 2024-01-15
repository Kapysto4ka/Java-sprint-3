public class City {
    private String firstStreet;
    private String secondStreet;
    private String thirdStreet;

    public String getFirstStreet()
    {
        return firstStreet;
    }
    public String getSecondStreet()
    {
        return secondStreet;
    }
    public String getThirdStreet()
    {
        return thirdStreet;
    }
    public void setFirstStreet(String streetName)
    {
        if (!streetName.isEmpty()) {
        firstStreet = streetName;
        }
        else {
            System.out.println("Misnomer");
        }
    }
    public void setSecondStreet(String streetName)
    {
        if (!streetName.isEmpty()) {
            secondStreet = streetName;
        }
        else {
            System.out.println("Misnomer");
        }
    }
    public void setThirdStreet(String streetName)
    {
        if (!streetName.isEmpty()) {
            thirdStreet = streetName;
        }
        else {
            System.out.println("Misnomer");
        }
    }

}
