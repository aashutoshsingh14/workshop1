
import java.util.Scanner;

public class divisible
{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter number:");
int n = scan.nextInt();

    if (n%3==0)
    {   if (n%5==0)
       {System.out.println("DIVISIBLE BY BOTH 3 AND 5");}
              else
            {System.out.println("divisible only by 3");}
            
    }
       else if(n%5==0)
        {System.out.println(" divisible only by 5"); }
        
        else
         {System.out.println(" NOT DIVIISBLE BY BOTH");}
        
}
}