package weekeight;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Student
{
    
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName = "Islington College";

    
    public Student(int id, String name, String address, long phoneNumber)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    


    public void setId(int id)
    {
        this.id = id;
    }
    
        public int getId()
    {
        return this.id;
    }
    
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }

    

    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return this.address;
    }

    

        public void setPhoneNumber(long phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }


    public static void setCollegeName(String collegeName)
    {
        Student.collegeName = collegeName;
    }

    public static String getCollegeName()
    {
        return collegeName;
    }


    
    void displayInfo()
    {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("College Name: " + getCollegeName());
    }
}

