# Java Programming Examples

## Task 1: Write a class to display “Hello World”
### Display "Hello World"
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
## Output
```
$ javac HelloWorld.java
$ java HelloWorld
Hello, World!
```

## Task 2: Write a class to print N Fibonacci numbers. Assume any value for N.
### Print N Fibonacci Numbers

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
## Output
```
$ javac Fibonacci.java
$ java Fibonacci
Fibonacci Series of 10 numbers:
0 1 1 2 3 5 8 13 21 34
```

## Task 3: Write a class to find the G.C.D to two numbers
### Find the G.C.D of Two Numbers

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
## Output
```
$ javac GCDCalculator.java
$ java GCDCalculator
Enter the first number: 45
Enter the second number: 15
GCD of 45 and 15 is: 15
@Rohan00001 ➜ /workspaces/J
```

## Task 4: Write a class to print the first 10 prime numbers.
### Print the First 10 Prime Numbers

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

## Output
```
$ javac FirstTenPrimes.java
$ java FirstTenPrimes
First 10 prime numbers:
2 3 5 7 11 13 17 19 23 29
```

## Task 5: Write a class to reverse an array of characters of size 20.
### Reverse an Array of Characters (Size 20)

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
## Output
```
$ javac ReverseCharArray.java
$ java ReverseCharArray
Original Array:
A B C D E F G H I J K L M N O P Q R S T 

Reversed Array:
T S R Q P O N M L K J I H G F E D C B A 
```

## Task 6: Write a class to sort an array of integers of size 15
### Sort an Array of Integers (Size 15)

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
## Output
```
$ javac IntegerArraySorter.java
$ java IntegerArraySorter
Original Array:
3 8 44 70 46 13 89 0 84 53 47 35 18 89 91 

Sorted Array:
0 3 8 13 18 35 44 46 47 53 70 84 89 89 91 
```
