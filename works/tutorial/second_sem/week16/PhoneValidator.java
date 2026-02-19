package week16;


/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class PhoneValidator {

    public static boolean validate(String phone) 
    {
        String regex = "^(98|97)\\d{8}$";
        return phone.matches(regex);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Nepali phone number: ");
        String phone = sc.nextLine();
        if (validate(phone))
        {
            System.out.println(phone + " is a valid number.");
        } 
        else {
            System.out.println(phone + " is not a valid number.");
        }

       
    }
}
