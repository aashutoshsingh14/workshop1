package weekten;


/**
 * Write a description of class SavingsAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingsAccount extends Account 
{

    private static final double savingsRate = 5;

    public SavingsAccount(int accountNo, String holderName, double balance) 
    {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() 
    {
        return super.calculateInterest(savingsRate);
    }

    @Override
    public String toString()
    {
        return "Savings Account -> " + super.toString();
    }
}
