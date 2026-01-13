package weekeight;


/**
 * Write a description of class Atm here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Atm
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(101, "Aashutosh", 5000);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scan.nextDouble();
        userAccount.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scan.nextDouble();

        if(userAccount.withdraw(withdrawAmount))
        {
            System.out.println("Withdrawal successful");
        }
        else
        {
            System.out.println("Insufficient balance");
        }

        System.out.println("Current Balance: " + userAccount.getBalance());
    }
}
