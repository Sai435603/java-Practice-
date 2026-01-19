// Interface (used with implements)
interface Flyable {
    int MAX_SPEED = 300; // public static final by default

    void fly(); // public abstract by default
}

// Abstract class (used with extends)
abstract class Animal {
    static int count = 0; // static variable (shared)

    final String type; // final variable

    Animal(String type) {
        this.type = type;   // this → current object
        count++;
        System.out.println("Animal constructor called");
    }

    abstract void sound(); // abstract method

    final void breathe() { // final method
        System.out.println("Animal is breathing");
    }

    static void showCount() {
        System.out.println("Total animals: " + count);
    }
}

// Concrete class
class Dog extends Animal implements Flyable {

    String name;

    Dog(String name) {
        super("Mammal"); // super → parent constructor (FIRST LINE)
        this.name = name; // this → current object variable
        System.out.println("Dog constructor called");
    }

    @Override
    void sound() {
        System.out.println(name + " says: Bark");
    }

    @Override
    public void fly() {
        System.out.println("Dog cannot really fly, but speed is " + MAX_SPEED);
    }
}

// Final class (cannot be extended)
final class Puppy extends Dog {

    Puppy(String name) {
        super(name); // calling parent constructor
    }

    void play() {
        System.out.println(name + " is playing");
    }
}

// Main class
public class OOPAllKeywordsDemo {

    public static void main(String[] args) {

        Animal a = new Dog("Rocky"); // upcasting

        a.sound();        // runtime polymorphism
        a.breathe();      // final method

        // instanceof check
        if (a instanceof Dog) {
            Dog d = (Dog) a; // safe downcasting
            d.fly();
        }

        Puppy p = new Puppy("Tommy");
        p.play();

        // static method
        Animal.showCount();
    }
}
