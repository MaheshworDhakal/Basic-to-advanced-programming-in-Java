package InterfaceandPackage;
import MYpackage.Person;
public class Inheritanceindifferentpack extends Person
{
    void display()
    {
        System.out.Println("My name is maheshwor dhakal");

    }
    public static void main(String arg[])
    {
        Inheritanceindifferentpack me=new Inheritanceindifferentpack();
        me.showperson();
        me.display();
    }
}