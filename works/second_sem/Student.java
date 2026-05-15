
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Student
{
   
    private String name, gender, course;
    private ArrayList<String> hobbies;
   
    public Student( String name, String gender, String course, ArrayList<String> hobbies)
    {
        this.name = name;
        this.gender = gender;
        this.hobbies = hobbies;
        this.course = course;
    }
   
    @Override
    public String toString()
    {
        return "Name: "+name+ "Gender: "+gender+ "Course: "+course+ "Hobbies: "+hobbies;
    }
}