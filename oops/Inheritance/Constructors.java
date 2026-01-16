//constructors execution is from top to bottom 
// but constructor calling is from bottom to top

// here constructor c() calls B() and then  B() calls A() after that A() executes first followed by B() then C()


// this() , super()  -> should be the first line od a constructor

class A {
    A() {
        System.out.println("A constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B constructor");
    }
}

class C extends B {
    C() {
        System.out.println("C constructor");
    }
}
