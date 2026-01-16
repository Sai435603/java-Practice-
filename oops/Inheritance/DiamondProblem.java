// A class inherits from two classes

// Both those classes inherit from the same parent

// The child class gets confused about which parent method to use

// class A {
//     void show() {
//         System.out.println("A");
//     }
// }

// class B extends A {
// }

// class C extends A {
// }

// // NOT ALLOWED IN JAVA
// class D extends B, C {
// }

// in c++ we use virtual classes 
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
}

interface C extends A {
}

class D implements B, C {
    @Override
    public void show() {
        B.super.show(); // OR C.super.show()
    }
}


