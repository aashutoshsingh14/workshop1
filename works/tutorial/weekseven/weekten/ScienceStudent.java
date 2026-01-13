package weekten;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStudent extends Student 
{

    private static final double sciencePassMarks = 45;

    public ScienceStudent(int rollNo, String name, double marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        if (getMarks() >= sciencePassMarks) {
            return super.calculateResult();
        } 
        else {
            return "Fail";
        }
    }

    @Override
    public String toString() {
        return "Science Student : " + super.toString();
    }
}
