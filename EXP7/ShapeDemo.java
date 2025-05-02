import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        Shape rect = new Rectangle(length, width);
        rect.calculateArea();

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Shape circle = new Circle(radius);
        circle.calculateArea();

        sc.close();
    }
}
