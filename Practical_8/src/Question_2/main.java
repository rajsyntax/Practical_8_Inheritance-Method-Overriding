package Question_2;


// Parent class
class Shape {

    // Method to calculate area (overridden by child classes)
    double area() {
        return 0.0;
    }
}

// Circle inherits the Shape class
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding area() to calculate circle area
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle inherits the Shape class
class Rectangle extends Shape {
    double length;
    double breadth;

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding area() to calculate rectangle area
    @Override
    double area() {
        return length * breadth;
    }
}

// Triangle inherits the Shape class
class Triangle extends Shape {
    double base;
    double height;

    // Constructor to initialize base and height
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding area() to calculate triangle area
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Main class to execute the program
public class main {
    public static void main(String[] args) {

        // Parent-class reference for runtime polymorphism
        Shape s;

        // Circle object
        s = new Circle(5.0);
        System.out.println("Circle");
        System.out.println("Radius: 5.0");
        System.out.printf("Area: %.2f sq. units%n", s.area());

        // Rectangle object
        s = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle");
        System.out.println("Length: 4.0, Breadth: 6.0");
        System.out.printf("Area: %.2f sq. units%n", s.area());

        // Triangle object
        s = new Triangle(10.0, 5.0);
        System.out.println("\nTriangle");
        System.out.println("Base: 10.0, Height: 5.0");
        System.out.printf("Area: %.2f sq. units%n", s.area());
    }
}
