//if a interface has a single abstract method then we call it as  functional interface 

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);   // SAM → Single Abstract Method
}

public class Main {

    public static void main(String[] args) {

        // 1️ Lambda for addition
        Calculator add = (a, b) -> a + b;

        // 2️Lambda for subtraction
        Calculator sub = (a, b) -> a - b;

        // 3️Lambda for multiplication
        Calculator mul = (a, b) -> a * b;

        // Using the lambdas
        System.out.println(add.operate(10, 5)); // 15
        System.out.println(sub.operate(10, 5)); // 5
        System.out.println(mul.operate(10, 5)); // 50
    }
}
