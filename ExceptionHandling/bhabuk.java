class Maheshwor extends Exception {

    Maheshwor(String message) {
        super(message);
    }
}

public class bhabuk {

    static void checkName(String name) throws Maheshwor {

        if (Character.isUpperCase(name.charAt(0))) {
            throw new Maheshwor("Name should not start with uppercase letter: " + name);
        } else {
            System.out.println("Valid name: " + name);
        }
    }

    public static void main(String[] args) {

        try {
            checkName("Bhabuk");

        } catch (Maheshwor e) {
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            System.out.println("Finally block executed");
        }
    }
}