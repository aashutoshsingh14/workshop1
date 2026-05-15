package weeek25;


/**
 * Write a description of class recursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class recursion
{
    public static void main(String[] args)
    {
        int fact=factorial(5);
        System.out.println("factorial="+fact);
        
    }
    
    public static int factorial(int n)
    {
    //base case
        if(n==0 || n==1)
        {
            return 1;
        }
        return n* factorial(n-1);
        
    }
    
    public static int binarySearch(int[] arr,int target,int left, int right)
    {
        if(arr==null || arr.length==0)
        {
            return -1;
        }
        return n* factorial(n-1);}
}