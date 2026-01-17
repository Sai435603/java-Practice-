// When a subclass provides its own implementation of a method already defined in its parent class.
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main{
    public static void main(String[] args){
         Animal a = new Dog(); // upcasting
         a.sound();
    }
}

//The method call is resolved at runtime, based on the actual object, not the reference type. [Cynamic Dispatch]

// SOURCE CODE
//    ↓
// COMPILER
//    ├─ checks method in reference
//    ├─ generates invokevirtual
//    ↓
// BYTECODE
//    ↓
// JVM
//    ├─ object type = B
//    ├─ v-table lookup
//    ├─ call B.sound()
