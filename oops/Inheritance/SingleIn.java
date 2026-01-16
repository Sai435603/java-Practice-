//Inheritance represents an IS-A relationship.
// @FunctionalInterface
// What it means
// @FunctionalInterface is used for an interface that has exactly one abstract method.


class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
    public static void main(String[] args){
         Dog dog = new Dog();
         dog.bark();
         dog.eat();
    }
}