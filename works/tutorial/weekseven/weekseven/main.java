package weekseven;
import java.util.Scanner;


public class main
{
    
   
    public static void main(String[] args)
    {
    // classname s1= new classname();   process to define an object;
    student s1=new student();
    s1.name="Aashutosh";
    s1.collegeID=1001;
    s1.age=19;
    
    System.out.println("first student:");
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.collegeID);
    
    student s2=new student();
    s2.name="Saujas";
    s2.collegeID=2002;
    s2.age=19;
    
    s1.study();
    s2.study();
    
    System.out.println();
    
    
    Scanner scan= new Scanner(System.in);
    
    car c1=new car();
    
    System.out.println("enter the brand:");
    c1.brand = scan.nextLine();
    
    System.out.println("enter the color:");
    c1.color=scan.nextLine();
     
    System.out.println("enter the price:");
    c1.price=scan.nextInt();
    
    c1.display();
    
    }

    
}



