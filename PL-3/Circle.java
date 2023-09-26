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
