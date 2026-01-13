package weekten;


/**
 * Write a description of class CurrentAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAccount extends Account 
{

    private static final double currentRate = 2;

    public CurrentAccount(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest(currentRate);
    }

    @Override
    public String toString() {
        return "Current Account -> " + super.toString();
    }
}
