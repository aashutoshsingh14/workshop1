package week16;


/**
 * Write a description of class one here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;


public class Three 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter index to retrieve character: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index < s1.length()) 
        {
            char ch = s1.charAt(index);
            System.out.println("Character at index " + index + " is: " + ch);
        } else {
            System.out.println("Invalid index.");
        }

        System.out.print("Enter a character to find its first occurrence: ");
        char search = sc.nextLine().charAt(0);

        int charposition = s1.indexOf(search);
        
        if (charposition != -1)
        {
            System.out.println("First occurrence of '" + search + "' is at index: " + charposition);
        }
        else {
            System.out.println("not found.");
        }

        System.out.print("Enter a word to search in the string: ");
        String word = sc.nextLine();

        if (s1.contains(word))
        {
            int wordPosition = s1.indexOf(word);
            System.out.println("The word is found at index: " + wordPosition);
        }
        else {
            System.out.println("The word is not found in the string.");
        }

        
    }


}

