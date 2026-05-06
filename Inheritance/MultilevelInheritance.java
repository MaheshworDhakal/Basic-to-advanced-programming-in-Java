
     class base {
    int x=5;
    int y=10;

    
}
class child1 extends base
{
    void show()
    {
        System.out.println("the value of the x is "+x);

    }
}
class child2 extends child1
{
    void display()
    {
        System.out.println("the value of the y is "+y);

    }
   
    
}
public class MultilevelInheritance
{
     public static void main(String arg[])
        {
            
            child2 obj=new child2();
            obj.display();
            obj.show();
        }
}
    
