
import java.util.Scanner;

public class discount
{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter MP:");
    double mp = scan.nextInt();
    
    double sp=0;
   System.out.println("Enter category A,B,C,D");
    String x= scan.next().toUpperCase();
    
    if(x=="A" )
    {sp=mp-(mp*0.6);}
    
    else if(x=="B")
    {sp=mp-(mp*0.4);}
    
    else if(x=="C")
    {sp=mp-(mp*0.3);}
    
    else {sp=mp-(mp*0.1);}
        
    System.out.println("the sp is "+sp);
}
}