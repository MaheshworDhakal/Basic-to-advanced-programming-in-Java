import java.util.Scanner;
public class EvenNum {
    
              public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int start = sc.nextInt();

        System.out.print("Enter second number: ");
        int end = sc.nextInt();

        System.out.println("Even numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
        }
    
    

