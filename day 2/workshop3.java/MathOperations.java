
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
  
   
   public static void main (String[] args)
   {
   int a=2,b=3;
   //arithmatic
   
   System.out.println("+ "+(a+b));
     System.out.println("* "+(a*b));
       System.out.println("- "+(a-b));
         System.out.println("/ "+(a/b));
           System.out.println("%"+(a%b));
             
   //pre and post increments
   System.out.println("post increment "+(a++));
   System.out.println("pre increment "+(++a));
   
   //assignment 
   
   int c=2,e=0,d=1;
   e+=5;
      System.out.println("e="+c);
   System.out.println("e+=5 --- "+e);
   System.out.println("d*=6 "+d);
   
   //relational
   int x=5, y=10;
      System.out.println("== "+(x==y));
      System.out.println("!= "+(x!=y));
      System.out.println("> "+(x>y));
      System.out.println("< "+(x<y));
   
    //logical
    
    boolean c1= true, c2=false;
    System.out.println("&& "+(c1&&c2));
    System.out.println("|| "+(c1||c2));
    System.out.println("! "+(!c1));
    
    
    //ternary
    String f=(a>b)? ("true"):("false");
    System.out.println(f);
    
    
    }

}