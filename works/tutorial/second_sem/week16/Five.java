package week16;


/**
 * Write a description of class five here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial string: ");
        String s1 = sc.nextLine();

        StringBuilder sb = new StringBuilder(s1);

        System.out.print("Enter second string to append: ");
        String s2 = sc.nextLine();
        sb.append(s2);

        System.out.print("Enter an integer to append: ");
        int num = sc.nextInt();
        sb.append(num);

        System.out.print("Enter a special character to append: ");
        char ch = sc.next().charAt(0);
        sb.append(ch);

        System.out.println("Final modified string: " + sb.toString());

    }
}
