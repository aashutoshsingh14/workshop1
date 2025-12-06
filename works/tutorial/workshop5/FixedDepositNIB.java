
/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class FixedDepositNIB
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);   
        String c="yes";                        // c=choice
        
        while(c.equalsIgnoreCase("yes"))
        {
        
        System.out.print("enter principle amount: ");
        double p=scan.nextDouble();           
        
        if(p<1000)
        {
        System.out.println("amount must be at least 1000");
        }
        else
        {
        System.out.print("enter rate (8-12): ");
        double r=scan.nextDouble();           
        
        System.out.print("enter years: ");
        int y=scan.nextInt();                 
        
        double mr=r/12;                      // mr=monthly rate
        int m=y*12;                          // m=total number of months
        double a=p;                          // a=amount (starting from principal)
        
        for(int i=1;i<=m;i++)               
        {
        a=a+(a*mr/100);                      // adding monthly interest
        }
        
        double f=a*0.005;                    // f=processing fee(0.5%)
        
        
        System.out.println("principle amount= "+p);
        System.out.println("maturity amount= "+a);
        System.out.println("fee= "+f);
        System.out.println("final amount= "+(a-f));
        }
        
        System.out.print("do you want to do it again? yes or no): ");
        c=scan.next();                       
        }
        
                              
    }
}
