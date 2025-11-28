
import java.util.Scanner;

public class evenodd
{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter number");
int n= scan.nextInt();

String x=(n%2==0)? ("even"):("odd");
    System.out.println(x);
    }
}