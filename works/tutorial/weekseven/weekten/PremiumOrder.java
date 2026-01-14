package weekten;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Orders
{
    public PremiumOrder(int orderId,String customerName,double amount)
    {
        super(orderId,customerName,amount);
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount();
    }
    
    public double calculateFinalAmount(double discount)
    {
        return super.calculateFinalAmount()-(getAmount()*discount);
    }
}

