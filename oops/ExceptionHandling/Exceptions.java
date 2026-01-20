import java.io.*;
import java.util.*;
// 1 Custom Checked Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class ExceptionDemo {

    // 2 throws (checked exception declaration)
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt"); // may throw IOException
    }

    // 3 throw (explicitly throwing exception)
    static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be >= 18");
        }
        System.out.println("Eligible to vote");
    }

    // 4 Runtime exception (unchecked)
    static void divide() {
        int x = 10 / 0; // ArithmeticException
    }

    // 5 Exception propagation
    static void level1() {
        level2();
    }

    static void level2() {
        level3();
    }

    static void level3() {
        int[] a = {1, 2};
        System.out.println(a[5]); // ArrayIndexOutOfBoundsException
    }

    public static void main(String[] args) {

        // 6 try-catch-finally + multiple catch order
        try {
            divide();       // runtime exception
            vote(16);       // checked custom exception
            readFile();     // checked exception
            level1();       // propagated exception
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("IO Exception occurred");
        }
        catch (Exception e) { // parent catch (last)
            System.out.println("Generic Exception caught");
        }
        finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Program continues...");
    }
}
