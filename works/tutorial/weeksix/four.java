
/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class four {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("\nenter the size of array  ");
        int n = scan.nextInt();  
        
        int[] a = new int[n];     
        int[] b = new int[n]; 
        int sum=0,avg=0,x=0,y=0;
        
        System.out.println("value hal vai  ");
            
        for (int i = 0; i < n; i++) 
        {   a[i] = scan.nextInt();  }
        
             
        System.out.println("  ");
            

          for (int i = 0; i < n; i++) 
        {   sum=sum+a[i];  }
        
        System.out.println("\nsum= "+sum);
        avg=sum/a.length;
        
        System.out.println("\naverage= "+avg);
        
        x=a[0];
        y=a[0];
        
          for (int i = 0; i < n; i++) 
        {       if(a[i]>x) 
                {x=a[i];}
        
                if(a[i]<y) 
                {y=a[i];}
        }
        
        System.out.println("smallest= "+y+"highest= "+x);
         
        for (int i = 0; i <n ; i++) 
        {    System.out.print(a[i] + " ");   }
    }
}


