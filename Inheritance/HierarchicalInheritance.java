 class Base {
    int x=5;
    int y=10;

    
}
class child1 extends Base
{
    void show()
    {
        System.out.println("the value of the x is "+x);

    }
}
class child2 extends Base 
{
    void display()
    {
        System.out.println("the value of the y is "+y);

    }
   
    
}
public class HierarchicalInheritance
{
     public static void main(String arg[])
        {
            child1 obs=new child1();
            obs.show();
            child2 obj=new child2();
            obj.display();
        }
}
