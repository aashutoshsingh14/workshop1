package weekeight;


/**
 * Write a description of class ElectricityApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityApp
{
    public static void main(String[] args)
    {
        ElectricityBill bill = new ElectricityBill("Aashutosh", 180);

        System.out.println("Consumer Name: " + "Aashutosh");
        System.out.println("Units Consumed: " + bill.getUnitsConsumed());
        System.out.println("Total Bill Amount: " + bill.calculateBill());
    }
}
