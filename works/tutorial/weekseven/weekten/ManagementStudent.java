package weekten;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student 
{

    private static final double managementPassMarks = 40;

    public ManagementStudent(int rollNo, String name, double marks) 
    {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() 
    {
        if (getMarks() >= managementPassMarks) 
        {
            return super.calculateResult();
        } 
        else {
            return "Fail";
        }
    }

    @Override
    public String toString() 
    {
        return "Management Student : " + super.toString();
    }
}
