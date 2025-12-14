
/**
 * Write a description of class seven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class seven {
    public static void main(String[] args) {
        String[][] seat={{"Aashu", "Stuti", "Shriti"},{"", "", ""}};
         System.out.println("\n");

        for(int i=0; i<2;i++) 
        {
            System.out.print("row "+(i+1)+": ");
            
            for (int j = 0; j < 3; j++) 
            {
                if (seat[i][j].equals(""))
                    System.out.print("\tempty");
                else
                    System.out.print("\t"+seat[i][j]);
            }
            
            System.out.println();
        }
    }
}
