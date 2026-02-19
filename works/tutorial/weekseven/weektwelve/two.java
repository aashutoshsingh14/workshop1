package weektwelve;


/**
 * Write a description of class two here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;

public class two
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        

        names.add("Aashutosh");
        names.add("Stuti");
        names.add("Saujas");
        names.add("Suridh");
        names.add("Subroth");

              System.out.println("using for each");
              
        for (Integer n : numbers)
        {
            System.out.println(n);
        }

        for (String s : names)
        {
            System.out.println(s);
        }

       System.out.println("using iterator");
        
        Iterator<Integer> numIt = numbers.iterator();
        while (numIt.hasNext())
        {
            System.out.println(numIt.next());
        }

        
        Iterator<String> nameIt = names.iterator();
        while (nameIt.hasNext())
        {
            System.out.println(nameIt.next());
        }

        names.remove(2);

        System.out.println("Size of numbers list: " + numbers.size());
        System.out.println("Size of names list: " + names.size());

        numbers.clear();

      
    }
}
