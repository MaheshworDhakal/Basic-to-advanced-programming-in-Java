  class Defineds extends Exception {

    Defineds(String message) {
        super(message);
    }
}

public class Userdefined {

    static void validateAge(int age) throws Defineds {

        if(age < 18) {
            throw new Defineds("Age cannot be less than 18");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(15);

        } catch(Defineds e) {
            System.out.println("Caught Exception: " + e.getMessage());

        } finally {
            System.out.println("Finally block executed");
        }
    }
}