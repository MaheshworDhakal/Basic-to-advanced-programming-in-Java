public class Thiskeyword {
    

    int x=20;
    void show(){
        int x=50;
        System.out.println("the value of the x is "+x);//gives output 50
        System.out.println("the value of the x is "+this.x);//gives output 20

    }
    public static void main(String arg[])
        {
            Thiskeyword obj =new Thiskeyword();
            obj.show();

        }
    
}
