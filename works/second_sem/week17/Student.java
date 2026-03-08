package week17;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {

    String id;
    String name;
    String course;

    public Student(String i, String n, String c) {
        id = i;
        name = n;
        course = c;
    }

    public String showInfo() {
        return "<html>"
                + "ID: " + id + "<br>"
                + "Name: " + name + "<br>"
                + "Course: " + course
                + "</html>";
    }
}