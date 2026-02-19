package weekeleven;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable
{
    public Wheat(double landArea)
    {
        super("Wheat", "Winter", landArea);
    }

    double calculateYield()
    {
        return getLandArea() * 2.8;
    }

    double calculateWaterRequirement()
    {
        return getLandArea() * 700;
    }

    public double calculateTransportCost()
    {
        return getLandArea() * 1500;
    }

    public String getTransportMethod()
    {
        return "Tractor";
    }
}
