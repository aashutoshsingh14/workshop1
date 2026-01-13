package weekten;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person {

    private String specialization;
    private double consultationFee;

    public Doctor(int id, String name, double baseSalary,String specialization, double consultationFee) 
    {
        super(id, name, baseSalary);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    
    @Override
    public double calculateSalary()
    {
        return super.calculateSalary() + consultationFee;
    }

    
    public double calculateSalary(int emergencyCases) 
    {
        return calculateSalary() + (emergencyCases * 1000);
    }

    
    @Override
    public String toString() 
    {
        return super.toString() +"  Specialization: " + specialization;
    }
}
