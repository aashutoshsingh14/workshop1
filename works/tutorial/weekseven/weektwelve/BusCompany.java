package weektwelve;


/**
 * Write a description of class buscompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

class BusCompany
{
    ArrayList<Bus> buses = new ArrayList<Bus>();

    public void addBus(Bus b)
    {
        buses.add(b);
    }

    public void removeBus(int index)
    {
        if (index >= 0 && index < buses.size())
        {
            buses.remove(index);
        }
        else
        {
            System.out.println("Invalid index");
        }
    }

    public void displayAll()
    {
        for (Bus b : buses)
        {
            b.display();
        }
    }
    
    public void displaybus()
    {
        for (Bus b : buses)
        {
            b.displaybus();
        }
    }

    public void displayRateMoreThan500()
    {
        for (Bus b : buses)
        {
            if (b.rate > 500)
            {
                b.display();
            }
        }
    }

    public void displayRedOrBlue()
    {
        for (Bus b : buses)
        {
            if (b.color.equals("red") || b.color.equals("blue"))
            {
                b.display();
            }
        }
    }
}
