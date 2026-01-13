package weekten;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner {

    private int partnerId;
    private String name;
    private double basePay;

   
    protected static final double extraOrderPay = 50;

    public DeliveryPartner(int partnerId, String name, double basePay) {
        this.partnerId = partnerId;
        this.name = name;
        this.basePay = basePay;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    public double getBasePay() {
        return basePay;
    }

    public double calculatePayment() {
        return basePay;
    }

    
    public double calculatePayment(int extraOrders) {
        return basePay + (extraOrders * extraOrderPay);
    }

    @Override
    public String toString() {
        return "Partner ID: " + partnerId +
               ", Name: " + name +
               ", Base Pay: " + basePay;
    }
}
