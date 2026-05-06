 class base {
    int data=30;
    
}
class Derived extends base
{
    int data =50;
    void display()
    {
        System.out.println("the value of the x is "+data);
        System.out.println("the value of the x is "+super.data);

    }
   
 
}
public class SuperKeyword
{
    public static void main(String[] args) {
    Derived obj=new Derived();
    obj.display();
    }
}
