
/**
 * Write a description of class six here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class six
{
    public static void main(String[] args) 
    {
        int[][] marks = {{80, 75},{90, 85}};

        System.out.println("\nStudent\tNepali\tEnglish");

        for (int i=0;i<2;i++) 
        {
            int total=marks[i][0]+marks[i][1];
            System.out.println("stu."+(i+1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\tTotal=" +total);
        }
    }
}

