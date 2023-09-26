# Java Programming Examples

## Task 1: Display "Hello World"

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Task 2: Print N Fibonacci Numbers

```java
public class Fibonacci {
    public static void main(String[] args) {
        int N = 10; // Change N to the desired number of Fibonacci numbers
        int a = 0, b = 1;

        System.out.println("Fibonacci Series of " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
```

## Task 3: Find the G.C.D of Two Numbers

```java
import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

## Task 4: Print the First 10 Prime Numbers

```java
public class FirstTenPrimes {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        System.out.println("First 10 prime numbers:");

        while (count < 10) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}
```

## Task 5: Reverse an Array of Characters (Size 20)

```java
public class ReverseCharArray {
    public static void main(String[] args) {
        // Create an array of characters of size 20
        char[] charArray = new char[20];

        // Fill the array with some characters (you can modify this as needed)
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) ('A' + i); // Filling with letters A to T
        }

        // Print the original array
        System.out.println("Original Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Reverse the array in-place
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            // Swap the characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the indices towards each other
            start++;
            end--;
        }

        // Print the reversed array
        System.out.println("\nReversed Array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}

```

## Task 6: Sort an Array of Integers (Size 15)

```java
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

```

