import java.util.Scanner;

public class seven
{
public static void main    (String[]args)
{
Scanner scan= new Scanner (System.in);


System.out.println("enter the data to store for later use");
System.out.println();

System.out.println("enter the first ausadi ");
String b=scan.nextLine();
System.out.println("enter price for it per tablet in rupee");
double bp=scan.nextDouble();
System.out.println("enter the stock available in tablet");
double bs=scan.nextDouble();
System.out.println();

System.out.println("enter the second ausadi ");
String c=scan.next();
System.out.println("enter price for it per tablet in rupee");
double cp=scan.nextDouble();
System.out.println("enter the stock available in tablet");
double cs=scan.nextDouble();
System.out.println();

System.out.println("enter the third ausadi ");
String d=scan.next();
System.out.println("enter price for it per tablet in rupee");
double dp=scan.nextDouble();
System.out.println("enter the stock available in tablet");
double ds=scan.nextDouble();
System.out.println();


System.out.println("    -------STOCK INFO-------");
System.out.println("    name="+b+"      price="+bp+"        stock="+bs);
String a=(bs<=5)? "    stock thorai xa restock gara chado":"    stock tannai xa";
System.out.println(a);

System.out.println("    ");
System.out.println("    name="+c+"      price="+cp+"        stock="+cs);
String y=(cs<=5)? "    stock thorai xa restock gara chado":"    stock tannai xa";
System.out.println(y);

System.out.println("    ");
System.out.println("    name="+d+"      price="+dp+"        stock="+ds);
String z=(ds<=5)? "    stock thorai xa restock gara chado":"    stock tannai xa";
System.out.println(z);

}

}