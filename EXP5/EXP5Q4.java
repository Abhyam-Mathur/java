import java.util.*;

abstract class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public abstract double computePay(int hours);
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8-hour workdays
        return daysWorked * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; // Fixed weekly salary
    }
}

public class EXP5Q4 {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John Doe", 100);
        Worker salariedWorker = new SalariedWorker("Jane Smith", 50);

        System.out.println("Daily Worker Pay for 48 hours: $" + dailyWorker.computePay(48));
        System.out.println("Salaried Worker Pay for 48 hours: $" + salariedWorker.computePay(48));
    }
}
