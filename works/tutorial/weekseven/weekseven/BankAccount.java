package weekseven;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



public class BankAccount
{
    int accNo;
    String holder;
    double balance;

    BankAccount(int a,String h,double b)
    {
        accNo=a;
        holder=h;
        balance=b;
    }

    void deposit(double amount)
    {
        balance=balance+amount;
    }

    void withdraw(double amount)
    {
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Not enough balance");
    }

    void display()
    {
        System.out.println(holder+" balance is "+balance);
    }
}





