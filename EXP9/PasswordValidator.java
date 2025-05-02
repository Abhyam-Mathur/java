// File: PasswordValidator.java
import java.util.Scanner;

class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidator {
    public static void validatePassword(String password) throws WeakPasswordException {
        if (password.length() < 8 || !password.matches(".*[a-zA-Z].*") || !password.matches(".*\\d.*")) {
            throw new WeakPasswordException("Password must be at least 8 characters long and include both letters and numbers.");
        }
        System.out.println("Password is strong!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password to validate: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        sc.close();
    }
}
