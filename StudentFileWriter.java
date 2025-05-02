import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentFileWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student data from user
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        System.out.print("Enter grade: ");
        String grade = scanner.nextLine();

        // Try writing to file
        try {
            FileWriter writer = new FileWriter("student.txt", true); // true for append mode

            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            writer.close();

            System.out.println("✅ Student info saved to student.txt successfully!");
        } catch (IOException e) {
            System.out.println("❌ An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
