package weektwelve;


/**
 * Write a description of class bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Bus
{
    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean availableStatus;
    int rate;

    public Bus(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate)
    {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public void display()
    {
        System.out.println("NumPlate: "+numberPlate + "  Color: " + color + "  Route: " + route + "  Customer:" + customerName + "  Available: " + availableStatus + "  Rate:" + rate);
    }


public void displaybus()
{System.out.println(numberPlate+" "+route+" "+color );}
}