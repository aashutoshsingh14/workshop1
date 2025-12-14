
/**
 * Write a description of class scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class scenario

{
    public static void main(String[] args)
    {
        String[] cat={"Fiction","Nepali"};
        String[][] titles={{"Asahamati-5"},{"Ek chihan"}};
        double[][] prices={{750.0},{500.0}};

        for(int i=0;i<2;i++)
        {
            System.out.println(cat[i]+":");
            
            for(int j=0;j<1;j++)
            {
                String t=titles[i][j];
                if(t==null||t.equals("")) t="[notitle]";
                System.out.printf("%s-Rs%.2f%n",t,prices[i][j]); // i wrote this on the basis of my knowlegde in C
            }
             System.out.println("");
        }
    }
}

