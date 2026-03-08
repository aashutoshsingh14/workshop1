package week16;


/**
 * Write a description of class six here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine().trim();

        // A 
        String reversed = "";
        for (int i=s1.length()-1;i>=0;i--) 
        {
            reversed += s1.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        // B
        if (s1.equals(reversed)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

       
    }
}
