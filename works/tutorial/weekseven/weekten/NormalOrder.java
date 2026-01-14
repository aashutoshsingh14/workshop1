package weekten;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Orders
{
    public NormalOrder(int orderId,String customerName,double amount)
    {
        super(orderId,customerName,amount);
    }
    
    @Override
    public double calculateFinalAmount()
    {
        return super.calculateFinalAmount();
    }
    
}

