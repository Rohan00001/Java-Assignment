public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 15, 3, 20, 25, 12, 18, 7};
        int n = numbers.length;

        System.out.println("Unsorted Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}