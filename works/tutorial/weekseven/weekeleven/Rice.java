package weekeleven;


/**
 * Write a description of class rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable
{
    public Rice(double landArea)
    {
        super("Rice", "Monsoon", landArea);
    }

    double calculateYield()
    {
        return getLandArea() * 3.5;
    }

    double calculateWaterRequirement()
    {
        return getLandArea() * 1500;
    }

    public double calculateTransportCost()
    {
        return getLandArea() * 2000;
    }

    public String getTransportMethod()
    {
        return "Tractor and SanoHAtti ";
    }
}
