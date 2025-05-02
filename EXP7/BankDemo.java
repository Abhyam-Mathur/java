import java.util.Scanner;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements Bank {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account myAccount = new Account();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        myAccount.deposit(depositAmount);
        myAccount.displayBalance();

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        myAccount.withdraw(withdrawAmount);
        myAccount.displayBalance();

        sc.close();
    }
}
