import java.util.Scanner;

class InvalidOrderAmountException extends Exception {
    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

public class OrderSystem {
    public static void processOrder(double amount) throws InvalidOrderAmountException {
        if (amount <= 0) throw new InvalidOrderAmountException("Order amount must be positive.");
        System.out.println("Order processed: ₹" + amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter order amount: ");
            double amount = sc.nextDouble();
            processOrder(amount);
        } catch (InvalidOrderAmountException e) {
            System.out.println("Order Error: " + e.getMessage());
        }
        sc.close();
    }
}
