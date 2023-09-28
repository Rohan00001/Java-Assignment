public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 15, 3, 20, 25, 12, 18, 7};
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}