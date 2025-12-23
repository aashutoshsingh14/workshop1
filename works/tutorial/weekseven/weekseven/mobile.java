package weekseven;


/**
 * Write a description of class mobile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mobile
{
    String brand;
    int price;

    mobile(String b,int p)
    {
        brand=b;
        price=p;
    }

    void x()
    {
        if(price<20000)
            System.out.println(brand+" is affordable");
        else
            System.out.println(brand+" is not affordable");
    }
}
