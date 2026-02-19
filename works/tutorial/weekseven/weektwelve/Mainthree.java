package weektwelve;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

class Student
{
    private String name;
    private String group;
    private String phone;

    public Student(String name, String group, String phone)
    {
        this.name = name;
        this.group = group;
        this.phone = phone;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}

public class Mainthree
{
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Rahul", "L1M1", "9841111111"));
        students.add(new Student("Gaurav", "L1C1", "9842222222"));
        students.add(new Student("Ayush", "L1B1", "9843333333"));

        System.out.println("Initial List:");
        for (int i = 0; i < students.size(); i++)
        {
            Student s = students.get(i);
            System.out.println(s.getName() + " " + s.getGroup() + " " + s.getPhone());
        }

        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getName().equals("Gaurav"))
            {
                students.remove(i);
            }
        }

        System.out.println("\nAfter removing Gaurav:");
        for (int i = 0; i < students.size(); i++)
        {
            Student s = students.get(i);
            System.out.println(s.getName() + " " + s.getGroup() + " " + s.getPhone());
        }

        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getName().equals("Ayush"))
            {
                students.add(i, new Student("Aavaya", "L1C1", "9876543213"));
                break;
            }
        }

        System.out.println("\nAfter adding Aavaya before Ayush:");
        for (int i = 0; i < students.size(); i++)
        {
            Student s = students.get(i);
            System.out.println(s.getName() + " " + s.getGroup() + " " + s.getPhone());
        }

        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getName().equals("Rahul"))
            {
                students.get(i).setGroup("L1N2");
            }
        }

        System.out.println("\nAfter changing Rahul group:");
        for (int i = 0; i < students.size(); i++)
        {
            Student s = students.get(i);
            System.out.println(s.getName() + " " + s.getGroup() + " " + s.getPhone());
        }

        for (int i = 0; i < students.size(); i++)
        {
            if (students.get(i).getName().equals("Ayush"))
            {
                students.get(i).setName("Aayush");
            }
        }

        System.out.println("\nAfter changing Ayush name:");
        for (int i = 0; i < students.size(); i++)
        {
            Student s = students.get(i);
            System.out.println(s.getName() + " " + s.getGroup() + " " + s.getPhone());
        }
    }
}
