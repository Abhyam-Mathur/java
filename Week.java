import java.util.Scanner;

public class Week {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter Your number(1-7):");
        int num1 = ob.nextInt();
        
        switch (num1) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid number! Please enter a number between 1 and 7.");
        }
    }
}
