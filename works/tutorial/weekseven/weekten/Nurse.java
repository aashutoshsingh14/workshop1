package weekten;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nurse extends Person 
{

    private String shift;
    private double extraAllowance;

    public Nurse(int id, String name, double baseSalary,String shift, double extraAllowance) 
    {
        super(id, name, baseSalary);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }

    @Override
    public double calculateSalary() 
    {
        return super.calculateSalary() + extraAllowance;
    }

    @Override
    public String toString() 
    {
        return super.toString() +
               ", Shift: " + shift;
    }
}
