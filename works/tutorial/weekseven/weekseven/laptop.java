package weekseven;


/**
 * Write a description of class laptop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class laptop
{
    String brand;
    int ram;
    double price;

    laptop(String b,int r,double p)
    {
        brand=b;
        ram=r;
        price=p;
    }

    void display()
    {
        System.out.println("brand: "+brand);
        System.out.println("ram: "+ram+" gb");
        System.out.println("price: "+price);
        System.out.println();
    }
}