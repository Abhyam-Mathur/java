import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = ob.nextDouble();
        
        System.out.print("Enter the length of the rectangle: ");
        double length = ob.nextDouble();
        
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = ob.nextDouble();
        
        System.out.print("Enter the side of the square: ");
        double side = ob.nextDouble();
        
        System.out.print("Enter the base of the triangle: ");
        double base = ob.nextDouble();
        
        System.out.print("Enter the height of the triangle: ");
        double height = ob.nextDouble();
    
        double circleArea = Math.PI * radius * radius;
        double squareArea = side * side;
        double rectangleArea = length * breadth;
        double triangleArea = 0.5 * base * height;

        System.out.println("\n--- Area Results ---");
        System.out.println("Circle Area: " + String.format("%.2f", circleArea));
        System.out.println("Square Area: " + String.format("%.2f", squareArea));
        System.out.println("Rectangle Area: " + String.format("%.2f", rectangleArea));
        System.out.println("Triangle Area: " + String.format("%.2f", triangleArea));
        
        ob.close(); 
    }
}
