package week16;


/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        
       
        String s3 = s1.concat(s2);

        System.out.println("Combined String: " + s3);

        
        System.out.print("Enter  string to compare: ");
        String s4 = sc.nextLine();

        
        if (s3.equals(s4)) {
            System.out.println("The combined string is equal to the input string.");
        } 
        else {
            System.out.println("The combined string is NOT equal to the input string.");
        }

     
        
        
        
        
        
    }
}
