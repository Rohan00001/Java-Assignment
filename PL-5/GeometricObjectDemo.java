// Abstract class GeometricObj
abstract class GeometricObj {
    String color;
    double weight;

    public GeometricObj() {
        this.color = "white";
        this.weight = 1.0;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    // Abstract method to find the area
    public abstract double findArea();

    // Abstract method to find the circumference
    public abstract double findCircumference();
}

// Subclass Triangle
class Triangle extends GeometricObj {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double weight, double side1, double side2, double side3) {
        super();
        this.color = color;
        this.weight = weight;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementing the abstract method to find the area of a triangle
    @Override
    public double findArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementing the abstract method to find the circumference of a triangle
    @Override
    public double findCircumference() {
        return side1 + side2 + side3;
    }
}

public class GeometricObjectDemo {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("blue", 2.5, 3.0, 4.0, 5.0);

        System.out.println("Color: " + triangle.getColor());
        System.out.println("Weight: " + triangle.getWeight());
        System.out.println("Area of Triangle: " + triangle.findArea());
        System.out.println("Circumference of Triangle: " + triangle.findCircumference());
    }
}