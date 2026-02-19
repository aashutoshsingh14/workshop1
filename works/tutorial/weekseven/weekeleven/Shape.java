package weekeleven;


/**
 * Write a description of class shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape 
{

    abstract double calculateArea();

    abstract double calculatePerimeter();

    void displayShapeInfo() 
    {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }
}
