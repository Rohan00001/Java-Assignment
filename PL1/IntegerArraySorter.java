public class IntegerArraySorter {
    public static void main(String[] args) {
        // Create an array of integers of size 15
        int[] intArray = new int[15];

        // Fill the array with some integers (you can modify this as needed)
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100); // Filling with random integers between 0 and 99
        }

        // Print the original array
        System.out.println("Original Array:");
        printIntArray(intArray);

        // Sort the array in ascending order using bubble sort
        bubbleSort(intArray);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        printIntArray(intArray);
    }

    // Method to sort an array of integers using bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        while (true) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    // Swap array[i-1] and array[i]
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // If no swaps were made in this pass, the array is sorted
            }
        }
    }

    // Method to print an array of integers
    public static void printIntArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
