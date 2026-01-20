// A Car has an Engine
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine(); // HAS-A
}
