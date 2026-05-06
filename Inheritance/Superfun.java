 class R {
    int data =50;
    void display()
    {
        System.out.print("the value of the x is "+data);
    }
    
}

class Derived extends R{
    int value =25;
    void display()
    {
        super.display();
        System.out.println("the value of the value is "+value );
    }
   

    
}
public class Superfun
{
     public static void main(String arg[])
    {
        Derived  d =new Derived();
        
        d.display();

    }
}