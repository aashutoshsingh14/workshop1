
/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 */

import java.util.Scanner;

public class three
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        String[] a = {"Saroj", "Sushant", "Ujjwal", "Rabina", "Sandesh"};

        System.out.println("All names in the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n");

        System.out.println("index 2: " + a[2]);

        a[4] = "Aashutosh";
        
        System.out.println("updated index 4: " + a[4]);

        System.out.println("enter the index you want to update 1 to 4:");
        int index = scan.nextInt();
        
        System.out.println("enter a new name :");
        String newname = scan.nextLine();
        scan.nextLine();

        a[index] = newname;

        System.out.println(" array:");
        for (int i=0;i<5;i++) 
        {
            System.out.print(a[i] + " ");
        }
    }
}


