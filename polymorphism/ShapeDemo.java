package polymorphism;
abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

// Triangle class
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);
        Shape shape3 = new Triangle(3, 4, 5);

        System.out.println("Circle:");
        System.out.println("Area: " + shape1.area());
        System.out.println("Perimeter: " + shape1.perimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + shape2.area());
        System.out.println("Perimeter: " + shape2.perimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + shape3.area());
        System.out.println("Perimeter: " + shape3.perimeter());
    }
}
