
/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class nine{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x=0,y=0,c=0,z=1,n=0;
    
        System.out.println("enter number");
        int a = scan.nextInt();
        int b=a;
    
        while (b!=0)
        {
            x=b%10;
            n=(n*10)+x;
            b=b/10;
            }
    System.out.println(n);    
    }
}
