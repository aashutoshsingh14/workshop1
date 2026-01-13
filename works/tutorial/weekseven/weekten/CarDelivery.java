package weekten;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPartner 
{

    private  double carBonus = 500;

    public CarDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + carBonus;
    }

    @Override
    public String toString() {
        return "Car Delivery : " + super.toString();
    }
}
