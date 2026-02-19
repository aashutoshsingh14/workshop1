package weekeleven;


/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements Drawable 
{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) 
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() 
    {
        return length;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public double getBreadth() 
    {
        return breadth;
    }

    public void setBreadth(double breadth) 
    {
        this.breadth = breadth;
    }

    double calculateArea() 
    {
        return this.length * this.breadth;
    }

    double calculatePerimeter() 
    {
        return 2 * (this.length + this.breadth);
    }

    public void draw() 
    {
        System.out.println("Drawing Rectangle");
    }
}

