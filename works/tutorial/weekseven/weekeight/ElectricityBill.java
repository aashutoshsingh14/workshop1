package weekeight;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private int unitsConsumed;

    public ElectricityBill(String consumerName, int unitsConsumed)
    {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed)
    {
        this.unitsConsumed = unitsConsumed;
    }

    public int getUnitsConsumed()
    {
        return unitsConsumed;
    }

    public double calculateBill()
    {
        if(unitsConsumed <= 100)
        {
            return unitsConsumed * 5;
        }
        else
        {
            return (100 * 5) + ((unitsConsumed - 100) * 8);
        }
    }
}