import java.util.Scanner;

public class six
{
public static void main    (String[]args)
{
Scanner scan= new Scanner (System.in);


System.out.println("enter water level in litre"); 
double l=scan.nextDouble();

String a=(l<=1000)? "status is normal":"OVER LIMIT WARNING!!!";

System.out.println(a);

}

}