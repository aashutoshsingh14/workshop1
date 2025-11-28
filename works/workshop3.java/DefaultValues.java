
/**
 * Write a description of class DefaultValues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValues
{            byte age = 20;                         
        short year = 2025;                     
        int x = 150000;        
        long d = 384_400_000L; 
        float price= 2.99f;          
        double pi = 3.1415926535;       
        char grade = 'A';                     
        boolean i = true;    

    public static void main(String[] args) 
    {

          DefaultValues z= new DefaultValues();

        System.out.println("Age (byte): " + z.age);
        System.out.println("Year (short): " + z.year);
        System.out.println("Town population (int): " + z.x);
        System.out.println("Distance to the Moon in meters (long): " + z.d);
        System.out.println("Price of a coffee (float): " + z.price);
        System.out.println("Approximation of pi (double): " + z.pi);
        System.out.println("Grade in class (char): " + z.grade);
        System.out.println("Is Java fun? (boolean): " + z.i);
    }
}

