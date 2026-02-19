package weektwelve;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        BusCompany bc = new BusCompany();

        bc.addBus(new Bus("BA1234", "red", "Kathmandu", "Aashutosh", true, 600));
        bc.addBus(new Bus("BA5678", "green", "Pokhara", "Stuti", false, 400));
        bc.addBus(new Bus("BA9999", "blue", "Chitwan", "Saujas", true, 800));

        System.out.println("All buses details only:");
        bc.displaybus();
        
        
         System.out.println("\nAll buses with additional details:");
        bc.displayAll();
        

        System.out.println("\nAfter removing bus at index 1:");
        bc.removeBus(1);
        bc.displayAll();

        System.out.println("\nBuses with rate more than 500:");
        bc.displayRateMoreThan500();

        System.out.println("\nBuses with color red or blue:");
        bc.displayRedOrBlue();
    }
}
