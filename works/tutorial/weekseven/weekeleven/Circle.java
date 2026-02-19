package weekeleven;


/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape implements Drawable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }
}
