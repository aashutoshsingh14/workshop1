package weekeight;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    private double basicSalary;

    public Employee(double salary)
    {
        this.basicSalary = salary;
    }

    public double calcSalary()
    {
        double bonus = basicSalary*0.20;
        return basicSalary + bonus;
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }
}
