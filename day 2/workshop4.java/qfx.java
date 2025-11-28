import java.util.Scanner;

public class qfx
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
    
        System.out.println("enter age group(child/adult/senior): ");
        String ag=scan.next().toLowerCase();
        
        double price=0;
        
        if(ag.equals("child"))
        {price=150;}
        
        else if(ag.equals("adult"))
        {price=250;}
        
        else if(ag.equals("senior"))
        {price=200;}
        
        else
        {System.out.println("invalid age group haleu");}
        

        System.out.println("kun language ho(nepali/hindi/english)? : ");
        String l=scan.next().toLowerCase();

        if(l.equals("nepali")){
        }else if(l.equals("hindi")){
            price=price+50;
        }else if(l.equals("english")){
            price=price+100;
        }else{
            System.out.println("amamama kasto vasa ho yo? Milena feri hala");
        }

        System.out.println("Timi student ho? (ho/haina): ");
        String st=scan.next().toLowerCase();
        if(st.equals("ho")){
            price=price-(price*0.20);
        }

        System.out.println("Is it a festival day? (ho/haina): ");
        String f=scan.next().toLowerCase();
        if(f.equals("ho")){
            price=price-(price*0.15);
        }

        System.out.println("Final ticket ko paisa Rs "+price+" vayo");
        
        System.out.println("CASH KI QR?");
    }
}
