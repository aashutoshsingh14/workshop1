
/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String c = "yes";
        while (c.equals("yes"))
        {

            System.out.println("enter first number a");
            int a = scan.nextInt();

            System.out.println("enter second number b");
            int b = scan.nextInt();

            System.out.println("choose :");
            System.out.println("1 for a + b");
            System.out.println("2 for a - b");
            System.out.println("3 for  a * b");
            System.out.println("4 for a / b");
            int choice = scan.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("a+b ="+(a+b));
                    break;

                case 2:
                    System.out.println("a-b ="+(a-b));
                    break;

                case 3:
                    System.out.println("a*b= "+(a*b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("a/b ="+(a/b));
                    else
                        System.out.println(" zero le divide hunna!");
                    break;

                default:
                    System.out.println("choice milena");
            }

            scan.nextLine(); 

            System.out.println("do you want to continue?");
            c = scan.nextLine();
        }

        System.out.println("Dhanyawad");
    }
}
