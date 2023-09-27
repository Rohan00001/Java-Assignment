public class Main {

    public static void main(String[] args) {
        Triangles triangle = new Triangles(10, 5);

        double area = triangle.findArea();
        double circumference = triangle.findCircumference();

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
