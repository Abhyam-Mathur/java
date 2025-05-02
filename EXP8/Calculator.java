import java.util.Scanner;

class DivisionByZeroException extends ArithmeticException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Calculator {
    public static int divide(int a, int b) {
        if (b == 0) throw new DivisionByZeroException("Cannot divide by zero.");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("Result: " + divide(a, b));
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
