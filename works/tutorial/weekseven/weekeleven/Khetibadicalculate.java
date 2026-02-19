package weekeleven;


/**
 * Write a description of class FarmCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Khetibadicalculate
{
    public static void main(String[] args)
    {
        Crop[] crops = new Crop[3];

        crops[0] = new Rice(1.5);
        crops[1] = new Wheat(1.0);
        crops[2] = new Maize(0.8);

        for (int i=0; i<crops.length; i++)
        {
            crops[i].displayCropInfo();

            Transportable t = (Transportable) crops[i];
            System.out.println("Transport kasari?: " + t.getTransportMethod());
            System.out.println("Transport bhada: " + t.calculateTransportCost());
          
        }
    }
}
