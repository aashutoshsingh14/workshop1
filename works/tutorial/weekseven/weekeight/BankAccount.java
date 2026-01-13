package weekeight;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private int accountNumber;
    private double balance;
    private String name;

    public BankAccount(int accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance=balance+amount;
        }
    }

    public boolean withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            balance=balance-amount;
            return true;
        }
        else
        {
            return false;
        }
    }
}
