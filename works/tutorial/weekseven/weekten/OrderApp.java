package weekten;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp
{
    public static void main(String[] args)
    {
        NormalOrder n= new NormalOrder(1,"Aashutosh",200);
        System.out.print(n);
        System.out.println("Amount: "+n.calculateFinalAmount());
        PremiumOrder p= new PremiumOrder(2,"Stuti",200);
        System.out.print(p);
        System.out.println("Amount: "+p.calculateFinalAmount(0.05));
    }
}
