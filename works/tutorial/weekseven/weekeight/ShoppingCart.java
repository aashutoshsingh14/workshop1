package weekeight;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;

    public ShoppingCart(String itemName, double itemPrice, int quantity)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public double calculateTotal()
    {
        return (this.itemPrice * this.quantity);
    }

    public double calculateDiscountedTotal(double discountPercent)
    {
        double total = calculateTotal();
        double discount = (discountPercent / 100) * total;
        return total - discount;
    }

    public void displayCart()
    {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
    }
}
