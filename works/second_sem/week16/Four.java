package week16;


/**
 * Write a description of class four here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        String upper = s1.toUpperCase();
        System.out.println("Uppercase: " + upper);

        String lower = s1.toLowerCase();
        System.out.println("Lowercase: " + lower);

        String[] words = s1.toLowerCase().split(" ");
        String titleCase = "";

        for (int i = 0; i < words.length; i++) 
        {
            if (words[i].length() > 0) {
                titleCase += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
            }
        }

        System.out.println("Title Case: " + titleCase.trim());

    }
}
