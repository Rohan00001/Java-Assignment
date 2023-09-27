Certainly, here are two separate Java files for each of the two questions:

**GeometricObject.java**
```java
// GeometricObject.java

// Develop an abstract class “GeometricObject”
public abstract class GeometricObject {
    private String colour;
    private double weight;

    // Constructor with default values
    public GeometricObject() {
        colour = "white";
        weight = 1.0;
    }

    // Getter method for colour
    public String getColour() {
        return colour;
    }

    // Getter method for weight
    public double getWeight() {
        return weight;
    }

    // Abstract method to find the area
    public abstract double findArea();

    // Abstract method to find the circumference
    public abstract double findCircumference();
}
```

**Triangle.java**
```java
// Triangle.java

// Write a subclass for “GeometricObject” called “Triangle”
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // Constructor for Triangle class
    public Triangle(String colour, double weight, double side1, double side2, double side3) {
        this.colour = colour;
        this.weight = weight;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Implementation of findArea() method for a triangle using Heron's formula
    @Override
    public double findArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementation of findCircumference() method for a triangle
    @Override
    public double findCircumference() {
        return side1 + side2 + side3;
    }
}
```

You can save these two Java files separately as `GeometricObject.java` and `Triangle.java`, respectively, and compile and run them as needed.