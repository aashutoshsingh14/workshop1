package weekseven;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    int sub1,sub2,sub3;

    int total()
    {
        return sub1+sub2+sub3;
    }

    double percent()
    {
        return total()/3.0;
    }

    void display()
    {
        System.out.println("subject 1: "+sub1);
        System.out.println("subject 2: "+sub2);
        System.out.println("subject 3: "+sub3);
        System.out.println("total marks: "+total());
        System.out.println("percentage: "+percent()+"%");
        System.out.println();
    }
}
