package weekseven;


public class mainone
{
    
   
    public static void main(String[] args)
    {
    // one
 System.out.println("_____________________________________________");
 System.out.println("One :");
            
        
    book b1=new book();
    b1.title="Parihar";
    b1.author="Ram sudan";
    b1.price=1900;
    
   
    
    b1.study();
    
    System.out.println("book 1:");
    System.out.println("title:"+b1.title);
    System.out.println("Author"+b1.author);
    System.out.println("Price"+b1.price);
    
    book b2=new book();
    b2.title="MunaMadan";
    b2.author="L.P Devkota";
    b2.price=500;
    
    System.out.println("");
    
     System.out.println("book 2:");
    System.out.println("title:"+b2.title);
    System.out.println("Author"+b2.author);
    System.out.println("Price"+b2.price);
    
    
    // two
    
 System.out.println("_____________________________________________");        
System.out.println("Two :");
            
    rectangle r1=new rectangle();
   r1.l=50;
   r1.b=10;
    
    
    System.out.println("rectangle 1:");
    System.out.println("length: "+r1.l);
    System.out.println("breadth: "+r1.b);
  
    System.out.println();
      
   rectangle r2=new rectangle();
   r2.l=50;
   r2.b=10;
    

    System.out.println("rectangle 2:");
    System.out.println("length: "+r2.l);
    System.out.println("breadth: "+r2.b);
    
    
    
    
    // three
    
 System.out.println("_____________________________________________");
 System.out.println("Three :");
            
    employee e1= new employee();
    
   e1.name="Aashutosh";
   e1.id=11;
   e1.salary=999999;
    
    e1.print();
    System.out.println();
    System.out.println("Name :"+e1.name);
    System.out.println("id: "+e1.id);
    System.out.println("salary: "+e1.salary);
    System.out.println();
    
    
    employee e2= new employee();
    
   e2.name="Aashu";
   e2.id=111;
   e2.salary=99999;
    
    System.out.println("Name :"+e2.name);
    System.out.println("id: "+e2.id);
    System.out.println("salary: "+e2.salary);
    System.out.println();
    
    
    employee e3= new employee();
    
   e3.name="Istu";
   e3.id=10;
   e3.salary=999;
    
    System.out.println("Name :"+e3.name);
    System.out.println("id: "+e3.id);
    System.out.println("salary: "+e3.salary);
  System.out.println();
  
  
 if (e1.salary>= e2.salary && e1.salary >= e3.salary)
        {
            System.out.println(e1.name+" has the greatest salary");
        }
        else if (e2.salary>= e1.salary && e2.salary >= e3.salary)
        {
            System.out.println(e2.name+" has the greatest salary");
        }
        else
        {
            System.out.println(e3.name+" has the greatest salary");
        }

        
        // four
 System.out.println("_____________________________________________");  
 System.out.println("Four :");
        
       laptop l1=new laptop("Dell",16,120000);
        laptop l2=new laptop("HP",8,95000);
        laptop l3=new laptop("Lenovo",12,110000);

        System.out.println("laptops with ram greater than 8gb:");

        if(l1.ram>8)
            l1.display();

        if(l2.ram>8)
            l2.display();

        if(l3.ram>8)
            l3.display();
            
            
            //five 
         System.out.println("_____________________________________________");
        System.out.println("Five :");
        
        mobile m1=new mobile("Samsung",18000);
        mobile m2=new mobile("Apple",80000);
        mobile m3=new mobile("Blackberry",15000);

        m1.x();
        m2.x();
        m3.x();
        
        //Six
        System.out.println("_____________________________________________");
        System.out.println("Six :");
        
        
        
        result re1=new result();
        re1.sub1=80;
        re1.sub2=90;
        re1.sub3=95;

        result re2=new result();
        re2.sub1=60;
        re2.sub2=70;
        re2.sub3=65;

        re1.display();
        re2.display();
        
    }
}



