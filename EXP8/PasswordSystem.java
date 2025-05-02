import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordSystem {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 6 || !password.matches(".*[A-Za-z].*") || !password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Password must be at least 6 characters with letters and numbers.");
        }
        System.out.println("Password is strong!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
        sc.close();
    }
}
