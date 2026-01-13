package weekten;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp {

    public static void main(String[] args) 
    {

        SavingsAccount savings =new SavingsAccount(101, "Aman", 50000);

        CurrentAccount current =new CurrentAccount(102, "Rohit", 40000);

        System.out.println(savings);
        System.out.println("Interest: " + savings.calculateInterest());
        System.out.println("Interest with custom rate: " +savings.calculateInterest(6));

        System.out.println();

        System.out.println(current);
        System.out.println("Interest: " + current.calculateInterest());
        System.out.println("Interest with custom rate: "+current.calculateInterest(3));
    }
}
