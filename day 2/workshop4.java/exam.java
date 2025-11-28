
import java.util.Scanner;

public class exam
{int scan;
  public static void main (String[] args)
  {Scanner scan =new Scanner(System.in);
      
   System.out.println("Enter your marks:");
int marks = scan.nextInt();

String f=(marks>=40)? ("pass"):("fail");
    System.out.println(f);
    }
}