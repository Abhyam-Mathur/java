package StudentManagementSystem;

import StudentRecords.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Aarav Sharma", 'A');
        Student student2 = new Student(102, "Priya Verma", 'B');

        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
    }
}
