
/**
 * Write a description of class DataTypeInspector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

   
     public class DataTypeInspector
     {

    public static void main(String[] args) 
    {

        byte age = 20;                         
        short year = 2025;                     
        int x = 150000;        
        long d = 384_400_000L; 
        float price= 2.99f;          
        double pi = 3.1415926535;       
        char grade = 'A';                     
        boolean i = true;              

        System.out.println("Age (byte): " + age);
        System.out.println("Year (short): " + year);
        System.out.println("Town population (int): " + x);
        System.out.println("Distance to the Moon in meters (long): " + d);
        System.out.println("Price of a coffee (float): " + price);
        System.out.println("Approximation of pi (double): " + pi);
        System.out.println("Grade in class (char): " + grade);
        System.out.println("Is Java fun? (boolean): " + i);
    }
}

