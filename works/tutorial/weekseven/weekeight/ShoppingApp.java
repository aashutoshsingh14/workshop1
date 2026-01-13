package weekeight;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart("Shoes", 3000, 2);

        cart.displayCart();

        cart.setQuantity(3);
        System.out.println("Updated Quantity: " + cart.getQuantity());

        System.out.println("Total Amount: " + cart.calculateTotal());
        System.out.println("Festival Offer Price: " + cart.calculateDiscountedTotal(10));
    }
}
