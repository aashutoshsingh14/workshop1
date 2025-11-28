
import java.util.Scanner;

public class aaa

{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter gpa (0.00-4.00):");
    double n = scan.nextDouble();
    
    System.out.println("enter attendance percentage i.e if 90% enter only 90:");
    double a= scan.nextDouble();
    
     
    System.out.println("enter attitude score:");
    double as= scan.nextDouble();
    
if(n<4.00)
   { if (n>3.20)
    {   if (a>80 && as>5)
       {System.out.println("eligible");}
            
            else
             {System.out.println("not eligible");}
    }
        else
         {System.out.println(" not eligible ");}
    }
    
else
 {System.out.println("gpa range vitra hala");}
        
}
}