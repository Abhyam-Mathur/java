import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter the First subject marks:");
        double subject1 = ob.nextDouble();

        System.out.println("Enter the Second subject marks:");
        double subject2 = ob.nextDouble();

        System.out.println("Enter the Third subject marks:");
        double subject3 = ob.nextDouble();

        double average = (subject1 + subject2 + subject3) / 3;

        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Your grade is A");
        } else if (average >= 75) {
            System.out.println("Your grade is B");
        } else if (average >= 50) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is F");
        }

        ob.close(); // Closing the scanner to prevent resource leaks
    }
}
