
import java.util.Scanner;

public class gpa

{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter gpa (0.00-4.00):");
    double n = scan.nextDouble();
if(n<4.00)
   { if (n>1.00)
    {   if (n<1.60)
       {System.out.println("D");}
              else if(n>1.60 && n<2.40)
            {System.out.println("C");}
            else if(n>2.40 && n<3.20)
            {System.out.println("B");}
            else
             {System.out.println("A");}
    }
        else
         {System.out.println(" F ");}
    }
    
    else
     {System.out.println("gpa range vitra hala");}
        
}
}