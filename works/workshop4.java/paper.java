
import java.util.Scanner;

public class paper
{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   
    

   System.out.println("Enter category A0,A1,A2,A3,A4,A5");
    String x= scan.next().toUpperCase();
    switch (x)
    {
    case "A0" :
    {  System.out.println("A0: 841 x 1189 mm (33.1 x 46.8 inches)");}
    break;
    
    case "A1" :
   {  System.out.println("A1: 594 x 841 mm (23.4 x 33.1 inches)");}
    break;

    case "A2" :
    {  System.out.println("A2: 420 x 594 mm (16.5 x 23.4 inches)");}
    break;

     case "A3" :
    {  System.out.println("A3: 297 x 420 mm (11.7 x 16.5 inches)");}
    break;
    
    case "A4" :
    {  System.out.println("A4: 210 x 297 mm (8.3 ");}
    break;
    
    case "A5" :
    {  System.out.println("A5: 148 x 210 mm (5.8");}
    break;

    default :
    { System.out.println("galti vo");}
    
}  


}
}