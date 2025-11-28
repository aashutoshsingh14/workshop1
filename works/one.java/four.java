import java.util.Scanner;

public class four
{
public static void main    (String[]args)
{
Scanner scan= new Scanner (System.in);
System.out.println("enter name"); 
String name=scan.nextLine();
System.out.println("enter age"); 
int age=scan.nextInt();
System.out.println("enter gpa"); 
double gpa=scan.nextDouble();

System.out.println("the name is "+name+",age is "+age+"and gpa is "+gpa);
}

}