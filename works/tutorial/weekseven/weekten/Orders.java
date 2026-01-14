package weekten;


/**
 * Write a description of class Orders here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orders
{
    private int orderId;
    private String customerName;
    private double amount;
    
    public Orders(int orderId,String customerName,double amount)
    {
        this.orderId=orderId;
        this.customerName=customerName;
        this.amount=amount;
    }
    
    public int getOrderId()
    {
        return orderId;
    }
    
    public void setOrderId()
    {
        this.orderId=orderId;
    }
    
    public String getCustomerName()
    {
        return customerName;
    }
    
    public void setCustomerName()
    {
        this.customerName=customerName;
    }
    
    public double getAmount()
    {
        return amount;
    }
    
    public void setAmount()
    {
        this.amount=amount;
    }
    
    public double calculateFinalAmount()
    {
       return amount; 
    }
    
   @Override
    public String toString()
    {
        return "Orders[Order ID=" +orderId+ ",Customer Name=" +customerName+ "]";
    }
}