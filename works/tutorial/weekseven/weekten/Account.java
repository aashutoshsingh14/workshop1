package weekten;


/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account {

    private int accountNo;
    private String holderName;
    private double balance; 

    public Account(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return 0;
    }

    public double calculateInterest(double rate) {
        return balance * rate / 100;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNo + ", Holder Name: " + holderName + ", Balance: " + balance;
    }
}
