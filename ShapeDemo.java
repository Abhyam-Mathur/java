
abstract class Shape {
    abstract void calculateArea();
}


class Rectangle extends Shape {
    double length;
    double width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

 
    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding calculateArea method
    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class renamed to ShapeDemo
public class ShapeDemo {
    public static void main(String[] args) {
        // Create Rectangle object
        Shape rectangle = new Rectangle(5.0, 3.0);
        rectangle.calculateArea();

        // Create Circle object
        Shape circle = new Circle(4.0);
        circle.calculateArea();
    }
}
