public class Car extends Transport {
    boolean isWipersOn;
    public void startWipers(){
        if (isWipersOn){
            System.out.println("Wipers working....");
        }
        else {
            System.out.println("Wipers turned off");
        }
    }
}
