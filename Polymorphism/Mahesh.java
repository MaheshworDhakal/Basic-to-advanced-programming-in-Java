class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void sound() {
        System.out.println("Puppy cries softly");
    }
}

public class Mahesh {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Animal a3 = new Puppy();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}