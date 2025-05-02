// File: Calculator.java
import java.util.Scanner;

class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculator {
    public static int divide(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
