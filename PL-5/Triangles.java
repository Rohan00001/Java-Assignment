import GeometricObject;

public class Triangles extends GeometricObject {
    private double base;
    private double height;

    public Triangles() {
    }

    public Triangles(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    public Triangles(double base, double height, String color, double weight) {
        super(color, weight);
        this.base = base;
        this.height = height;
    }

    @Override
    public double findArea() {
        return 0.5 * base * height;
    }

    @Override
    public double findCircumference() {
        return base + 2 * height;
    }
}
