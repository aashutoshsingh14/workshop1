
/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class array {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter the size of array  ");
        int n = scan.nextInt();  
        
        int a[] = new int[n];     
        int b[] = new int[n]; 
        int temp,x;
        x=n-1;
        
            System.out.println("value hal vai  ");
            
        for (int i = 0; i < n; i++) 
        {   a[i] = scan.nextInt();  }
        
             System.out.println("  ");
            
        for (int i = 0; i < n; i++) 
        {   temp = a[i];
            b[x]=temp;
            temp=0;
            x--;
}

  for (int i = 0; i < n; i++) 
        {   a[i]=b[i];  }
        
        
         
        for (int i = 0; i <n ; i++) 
        {    System.out.print(a[i] + " ");   }
    }
}


