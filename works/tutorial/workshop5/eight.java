
/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("enter number");
            int a = scan.nextInt();
            
            for(int i=1;i<=10;i++)
            {System.out.println(a+" X "+i+" = "+(a*i));}

    }
}
