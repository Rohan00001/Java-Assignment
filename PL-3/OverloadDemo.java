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
