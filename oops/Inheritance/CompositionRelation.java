//Has-a Replationship
// No inheritance
// loose coupling

// Famous Java principle:

// “Favor composition over inheritance.”


class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine; // HAS-A

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
