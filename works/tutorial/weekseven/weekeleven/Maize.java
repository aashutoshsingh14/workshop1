package weekeleven;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable
{
    public Maize(double landArea)
    {
        super("Maize", "ramromausam", landArea);
    }

    double calculateYield()
    {
        return getLandArea() * 2.2;
    }

    double calculateWaterRequirement()
    {
        return getLandArea() * 500;
    }

    public double calculateTransportCost()
    {
        return getLandArea() * 1000;
    }

    public String getTransportMethod()
    {
        return "Punjabi Truck and bhatbhatey";
    }
}
