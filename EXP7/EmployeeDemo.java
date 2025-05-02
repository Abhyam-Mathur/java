import java.util.Scanner;

abstract class Employee {
    String name, role;
    abstract void calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    double fixedSalary;

    Manager(String name, double salary) {
        this.name = name;
        this.role = "Manager";
        this.fixedSalary = salary;
    }

    void calculateSalary() {
        System.out.println("Manager Salary: " + fixedSalary);
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role);
    }
}

class Developer extends Employee {
    int hoursWorked;
    double hourlyRate;

    Developer(String name, int hours, double rate) {
        this.name = name;
        this.role = "Developer";
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Developer Salary: " + salary);
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Role: " + role);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Manager input
        System.out.print("Enter manager name: ");
        String managerName = sc.nextLine();
        System.out.print("Enter fixed salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline
        Manager mgr = new Manager(managerName, salary);
        mgr.displayDetails();
        mgr.calculateSalary();

        // Developer input
        System.out.print("Enter developer name: ");
        String devName = sc.nextLine();
        System.out.print("Enter hours worked: ");
        int hours = sc.nextInt();
        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();
        Developer dev = new Developer(devName, hours, rate);
        dev.displayDetails();
        dev.calculateSalary();

        sc.close();
    }
}
