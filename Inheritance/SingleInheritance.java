import java.util.Scanner;

     class A {
    public int x;
    private int y;
    protected int z;
    int a;

    A(Scanner sc) {
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        y = 10;
        z = 20;
        a = 5;
    }

    // Getter for private variable y
    public int getY() {
        return y;
    }
}

class Derived extends A {

    Derived(Scanner sc) {
        super(sc); // call parent constructor
    }

    void show() {
        System.out.println("Value of x: " + x);
        System.out.println("Value of y: " + getY()); // use getter
        System.out.println("Value of z: " + z);
        System.out.println("Value of a: " + a);
    }

}
public class SingleInheritance
{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Derived obj = new Derived(sc);
        obj.show();

        sc.close();
    }
}