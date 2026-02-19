package weektwelve;


/**
 * Write a description of class arraylist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class arraylist
{
    public static void main(String[] args)
    {
       
        ArrayList<String> names = new ArrayList<String>();
        names.add("Aashutosh");
        names.add("Stuti");
        names.add("Saujas");
       

        System.out.println("Names:");
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

       
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
    

        System.out.println("\nNumbers:");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
    }
}
