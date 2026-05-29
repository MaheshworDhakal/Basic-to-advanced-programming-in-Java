class SumExceededException extends Exception {

    SumExceededException(String message) {
        super(message);
    }
}

public class SUM {

    static void checkSum(int a, int b) throws SumExceededException {

        int sum = a + b;

        if (sum > 50) {
            throw new SumExceededException("Sum exceeds 50. Current sum = " + sum);
        } else {
            System.out.println("Valid sum = " + sum);
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("enter the value of first number");
            int a=Integer.parseInt();
             System.out.println("enter the value of second number");
            int b=Integer.parseInt();
            checkSum(a, b);

        } catch (SumExceededException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            System.out.println("Finally block executed");
        }
    }
}