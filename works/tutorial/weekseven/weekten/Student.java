package weekten;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {

    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void setRollNo(int rollNo) 
    {
        this.rollNo = rollNo;
    }

    public int getRollNo() 
    {
        return rollNo;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setMarks(double marks) 
    {
        this.marks = marks;
    }

    public double getMarks() 
    {
        return marks;
    }

    public String calculateResult() 
    {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public String calculateResult(int graceMarks) 
    {
        double finalMarks = marks + graceMarks;

        if (finalMarks >= 40) {
            return "Pass (with grace)";
        } else {
            return "Fail";
        }
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNo +", Name: " + name +", Marks: " + marks;
    }
}
