

class Parent {

    static {
        System.out.println("Parent static block");
    }
    // instance initialization block (IIB')'
    {
        System.out.println("Parent instance block");
    }

    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int x) {
        System.out.println("Parent parameterized constructor: " + x);
    }
}

// --------------------------------------------------

class Child extends Parent {

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child instance block");
    }

    Child() {
        this(100); // constructor chaining within same class
        System.out.println("Child default constructor");
    }

    Child(int x) {
        super(x); // constructor chaining to parent
        System.out.println("Child parameterized constructor: " + x);
    }
}

// --------------------------------------------------
    
class Singleton {

    private static Singleton instance;

    static {
        System.out.println("Singleton static block");
    }

    private Singleton() {
        System.out.println("Singleton private constructor");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// --------------------------------------------------

public class Main {

    static {
        System.out.println("Main static block");
    }

    {
        System.out.println("Main instance block");
    }

    Main() {
        System.out.println("Main constructor");
    }

    public static void main(String[] args) {

        System.out.println("Creating Child object");
        Child c = new Child();

        System.out.println("Creating Singleton objects");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Same instance: " + (s1 == s2));

        System.out.println("Creating Main object");
        new Main();
    }
}


// op:
// Default constructor
// Parameterized constructor
// Constructor overloading
// Constructor chaining using this()
// Constructor chaining using super()
// Static initialization block
// Instance initialization block
// Private constructor
// Singleton pattern
// Execution order in inheritance