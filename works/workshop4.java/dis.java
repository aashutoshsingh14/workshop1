
import java.util.Scanner;

public class dis
{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter MP:");
    double mp = scan.nextInt();
    
    double sp=0;
   System.out.println("Enter category A,B,C,D");
    String x= scan.next().toUpperCase();
    switch (x)
    {
    case "A" :
    {sp=mp-(mp*0.6);}
    break;
    
    case "B" :
    {sp=mp-(mp*0.4);}
    break;

    case "C" :
    {sp=mp-(mp*0.3);}
    break;

     case "D" :
    {sp=mp-(mp*0.1);}
    break;

    default :
    { System.out.println("galti vo");}
    
}  
    System.out.println("the sp is "+sp);

}
}