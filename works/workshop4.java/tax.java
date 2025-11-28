import java.util.Scanner;

public class tax
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Enter your annual income in Rs: ");
        double x=scan.nextDouble();
        
        double t=0;
        
        if(x<=500000)
        {t=x*0.01;}
        
        else if(x<=700000)
        { t=5000+(x-500000)*0.10;}
        
        else if(x<=1000000)
        {t=15000+(x-700000)*0.20;}
        
        else if(x<=2000000)
        {t=35000+(x-1000000)*0.30;}
        
        else if(x<=5000000)
        {t=335000+(x-2000000)*0.36;}
        
        else{t=1135000+(x-5000000)*0.39;}
        
        System.out.println("your annual income: Rs "+x);
        System.out.println("your total tax : Rs "+t);
    }
}
