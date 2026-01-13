package weekeight;


/**
 * Write a description of class SeparateClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeparateClass
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(25000);

        System.out.println("Basic Salary: " + emp.getBasicSalary());
        System.out.println("Gross Salary: " + emp.calcSalary());
    }
}
