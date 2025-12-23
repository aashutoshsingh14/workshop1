package weekseven;


/**
 * Write a description of class mainscenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import java.util.Scanner;

public class mainscenario
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        BankAccount ramAcc=new BankAccount(1,"Ram",5000);
        BankAccount sitaAcc=new BankAccount(2,"Sita",8000);

        System.out.print("Enter deposit amount for Ram: ");
        double d1=scan.nextDouble();
        ramAcc.deposit(d1);

        System.out.print("Enter withdrawal amount for Ram: ");
        double w1=scan.nextDouble();
        ramAcc.withdraw(w1);

        System.out.print("Enter deposit amount for Sita: ");
        double d2=scan.nextDouble();
        sitaAcc.deposit(d2);

        System.out.print("Enter withdrawal amount for Sita: ");
        double w2=scan.nextDouble();
        sitaAcc.withdraw(w2);

        ramAcc.display();
        sitaAcc.display();
    }
}
