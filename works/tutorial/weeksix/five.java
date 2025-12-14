
/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 */

import java.util.Scanner;

public class five
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] a = {"Morang", "Kathmandu","Kaski", "Sindhuli"};

        System.out.println("All districts in the array:");
        
        for (int i = 0; i < 4; i++) 
        {
            System.out.print((i+1)+"."+a[i]+ " ");
        }

        System.out.println("");

        System.out.println("enter new length:");
        int l = scan.nextInt();
        
        scan.nextLine();
        
        a = new String[l];
        
        System.out.println("enter  new districts :");
        for (int i=0;i<l;i++) 
        {
            a[i] = scan.nextLine();
        }
        

        System.out.println(" array:");
        for (int i=0;i<l;i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}


