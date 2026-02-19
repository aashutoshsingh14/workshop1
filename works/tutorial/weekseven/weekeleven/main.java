package weekeleven;


/**
 * Write a description of class mainn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main 
{
    public static void main(String[] args) 
    {

        Shape[] s1 = new Shape[4];

        s1[0] = new Rectangle(5, 3);
        s1[1] = new Circle(4);
        s1[2] = new Rectangle(8, 4);
        s1[3] = new Circle(6);

        for (int i=0; i < s1.length; i++) 
        {
            s1[i].displayShapeInfo();
        }
    }
}
