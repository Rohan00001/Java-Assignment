# JAVA Programming PL-3
## Task 1: Complex Number Class

**Question:**
Write a Java class to represent complex numbers. Include necessary constructors and overload the addition, subtraction, multiplication, and division operations as member methods. A complex number is of the form a+ib, where 'a' and 'b' are real numbers. Provide a `main` method to demonstrate all operations involving complex numbers.

```java
public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructors
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Addition
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Subtraction
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Multiplication
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.imaginary * other.real) + (this.real * other.imaginary);
        return new ComplexNumber(newReal, newImaginary);
    }

    // Division
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = (other.real * other.real) + (other.imaginary * other.imaginary);
        double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / denominator;
        double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Display complex number
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumber(1.0, 2.0);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber difference = num1.subtract(num2);
        ComplexNumber product = num1.multiply(num2);
        ComplexNumber quotient = num1.divide(num2);

        System.out.println("Sum:");
        sum.display();

        System.out.println("Difference:");
        difference.display();

        System.out.println("Product:");
        product.display();

        System.out.println("Quotient:");
        quotient.display();
    }
}

```

### Task 2: Circle Class

**Question:**
Define a Java class named `Circle` with data members `radius` and `angle`. Implement methods for computing the circumference of the circle and the length of an arc for a given angle. In the `CircleDemo` class's `main` method, create a `Circle` object with a radius of 20 and calculate the circle's circumference and arc length when the angle is 90 degrees.

```java
class Circle {
    private double radius;
    private double angle;

    // Constructor
    public Circle(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    // Compute circumference of the circle
    public double circleCircumference() {
        return 2 * Math.PI * radius;
    }

    // Compute arc length for a given angle
    public double arcLength() {
        return (angle / 360) * circleCircumference();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(20.0, 90.0);
        double circumference = circle.circleCircumference();
        double arcLength = circle.arcLength();

        System.out.println("Circle Circumference: " + circumference);
        System.out.println("Arc Length for 90 degrees: " + arcLength);
    }
}

```

### Task 3: Employee Class

**Question:**
Write a Java program that defines an `Employee` class with member variables such as employee number, name, basic pay, house rent allowance (HRA), and dearness allowance (DA). Implement methods for calculating and displaying the gross salary of an employee. Provide both a default and parameterized constructor. In the `main` method, create an `Employee` object with sample data and calculate and display the gross salary.

```java
class Employee {
    private int empNo;
    private String name;
    private double basicPay;
    private double hra;
    private double da;

    // Default constructor
    public Employee() {
        this.empNo = 0;
        this.name = "";
        this.basicPay = 0.0;
        this.hra = 0.0;
        this.da = 0.0;
    }

    // Parameterized constructor
    public Employee(int empNo, String name, double basicPay, double hra, double da) {
        this.empNo = empNo;
        this.name = name;
        this.basicPay = basicPay;
        this.hra = hra;
        this.da = da;
    }

    // Calculate and display gross salary
    public void calc() {
        double grossSalary = basicPay + hra + da;
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", 50000.0, 10000.0, 8000.0);
        emp.calc();
    }
}

```

### Task 4: OverloadDemo Class

**Question:**
Create a Java class named `OverloadDemo` with two overloaded methods named `multiplication`. One method should multiply two integer numbers, and the other should multiply two float numbers. In the `main` method, demonstrate the use of these overloaded methods to show the polymorphism property of Java.

```java
class OverloadDemo {
    // Method to multiply two integers
    public int multiplication(int a, int b) {
        return a * b;
    }

    // Method to multiply two floats
    public float multiplication(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        int result1 = demo.multiplication(5, 3);
        float result2 = demo.multiplication(2.5f, 1.5f);

        System.out.println("Multiplication of two integers: " + result1);
        System.out.println("Multiplication of two floats: " + result2);
    }
}

```
