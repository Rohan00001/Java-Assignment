class TwoDFigure {
    double dimension1;
    double dimension2;

    public TwoDFigure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double calculateArea() {
        return 0.0; // Default implementation, to be overridden by derived classes
    }
}

class Rectangle extends TwoDFigure {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double calculateArea() {
        return dimension1 * dimension2;
    }
}

class Triangle extends TwoDFigure {
    public Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    public double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class TwoDFigureDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 8.0);
        Triangle triangle = new Triangle(4.0, 6.0);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
