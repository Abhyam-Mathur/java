// File: OrderProcessing.java
import java.util.Scanner;

class InvalidOrderAmountException extends Exception {
    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

public class OrderProcessing {
    public static void processOrder(double amount) throws InvalidOrderAmountException {
        if (amount <= 0) {
            throw new InvalidOrderAmountException("Order amount must be greater than zero.");
        }
        System.out.println("Order processed for amount: ₹" + amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter order amount: ₹");
            double amount = sc.nextDouble();
            processOrder(amount);
        } catch (InvalidOrderAmountException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
        sc.close();
    }
}
