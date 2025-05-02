class University {
    static String universityName = "ABC University"; 
    String studentName; 

    public University(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversityName() {
        System.out.println("University Name: " + universityName);
    }

    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName + ", University: " + universityName);
    }

    public static void main(String[] args) {
        displayUniversityName(); 

        University student1 = new University("Alice");
        University student2 = new University("Bob");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        universityName = "UPES University";

        System.out.println("\nAfter changing university name:");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
