import java.util.Scanner;

public class RikshawFare {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter distance:");
        float d = scan.nextFloat();
        

        System.out.println("Enter time in mins :");
        float t = scan.nextFloat();

        float x = 50; // base fare for 1 km
        float y = 10; // base fare for 1 min

        float fare = (x * d) + (y * t);

        
        scan.nextLine();

        System.out.println();
        System.out.println("type y for yes and n for no:");
        System.out.println("ARE YOU A LOCAL?");
        String l = scan.nextLine();

        float f = l.equals("y") ? (fare + 50) : fare;

        
         
        System.out.println();
        System.out.println("type y for yes and n for no:");
        System.out.println("IS THE TRAVEL DURING NIGHT?");
        String n = scan.nextLine();

        float g = n.equals("y") ? (f + 60) : f;

        System.out.println("final fare is Rs. " + g);

        scan.close();
    }
}
