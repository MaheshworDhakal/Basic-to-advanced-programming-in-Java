package InterfaceandPackage;
public class Imebank implements Bank
{ int amount =0;

    public void deposite(int x )
    {
        amount=amount+x;
        System.out.println("the deposited amount is "+x);

    }
    public  void withdraw(int a)
    {
        amount =amount-a;
        System.out.println("the withdraw amount is "+a);
    }
    public void showbalance()
    {
        System.out.println("the remaining balance is "+amount);
    }
    public static void main(String arg[] )
    {
        Imebank bhabuk=new Imebank();
        bhabuk.deposite(220000);
        bhabuk.withdraw(20000);
        bhabuk.showbalance();
        
    }
}