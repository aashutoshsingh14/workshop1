package week16;


/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        String trimmed = s1.trim();
        System.out.println("trimmed string: " + trimmed);

        if (trimmed.length() >= 10) {
            String firstTen = trimmed.substring(0, 10);
            System.out.println("first 10 chars: " + firstTen);
        }
        else {
            System.out.println("String has less than 10 chars.");
        }

        String[] letter = trimmed.split("\\s+");

        System.out.println("letter in the string:");
        for (int i = 0; i < letter.length; i++) 
        {
            System.out.println(letter[i]);
        }

       
        
        
      
    }
}













