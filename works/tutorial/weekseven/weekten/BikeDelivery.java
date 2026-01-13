package weekten;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class BikeDelivery extends DeliveryPartner {

    private  double bikeBonus = 200;

    public BikeDelivery(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + bikeBonus;
    }

    @Override
    public String toString() {
        return "Bike Delivery : " + super.toString();
    }
}

