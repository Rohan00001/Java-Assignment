abstract class GeometricObject {
    private String color;
    private double weight;

    // Default constructor
    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    // Parameterized constructor
    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Abstract method to find the area
    public abstract double findArea();

    // Abstract method to find the circumference
    public abstract double findCircumference();
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        // Default constructor for Triangle
        super(); // Calls the default constructor of GeometricObject
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(String color, double weight, double side1, double side2, double side3) {
        // Parameterized constructor for Triangle
        super(color, weight); // Calls the parameterized constructor of GeometricObject
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double findArea() {
        // Implement the area calculation for a triangle (using Heron's formula)
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double findCircumference() {
        // Implement the circumference calculation for a triangle
        return side1 + side2 + side3;
    }
}

public class GeometricObjectDemo {
    public static void main(String[] args) {
        // Create a Triangle object
        Triangle triangle = new Triangle("red", 2.5, 3.0, 4.0, 5.0);

        // Get and print the color and weight of the triangle
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Weight: " + triangle.getWeight());

        // Calculate and print the area and circumference of the triangle
        System.out.println("Area: " + triangle.findArea());
        System.out.println("Circumference: " + triangle.findCircumference());
    }
}
