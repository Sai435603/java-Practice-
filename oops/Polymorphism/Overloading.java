// When multiple methods have the same name but different parameter lists, and the method call is resolved at compile time.
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


// The compiler knows exactly which method to call by looking at arguments.