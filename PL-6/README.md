# JAVA Programming PL-6

## 1. Count Vowels in a String
**Question:** WAP in java to accept a string and count the number of vowels present in the string.

```java
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
```

## 2. Check Palindrome Word
**Question:** WAP in java to accept a word and check whether the word is palindrome or not.
```java
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
```

## 3. Count Blank Spaces, Words, and Characters:
**Question:**
WAP in java to accept a string and find :

i) Number of blank spaces in the string

ii) Number of words in the string.

iii) Number of characters present in the string.
```java
import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int blankSpaces = 0;
        int words = 0;
        int characters = input.length();

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                blankSpaces++;
            }
        }

        String[] wordArray = input.split("\\s+");
        words = wordArray.length;

        System.out.println("Number of blank spaces: " + blankSpaces);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + characters);
    }
}
```

## 4. Convert String to Uppercase
**Question:** WAP in java to accept a string and display the new string as all the character of the string converted to upper case.
```java
import java.util.Scanner;

public class UppercaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String upperCaseString = input.toUpperCase();

        System.out.println("Uppercase string: " + upperCaseString);
    }
}
```

## 5. Find Maximum and Minimum in an Array
**Question:** WAP in java to assign 10 different numbers in a single dimensional Array and display the maximum & 
minimum number of the elements

```java
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
```

## 6. Bubble Sort for Array
**Question:** WAP in java to enter a set of 10 integers. Sort the number in ascending order by using Bubble Sort 
technique. Display the sorted array.
```java
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
```

## 7. Find Highest and Lowest in a Matrix
**Question:** WAP in java to store the numbers in 4 by 4 Matrix in Double dimensional array. Find the highest and 
lowest number of the matrix by using assignment statement.
```java
public class MatrixMinMax {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 5, 8, 15},
            {3, 20, 25, 12},
            {18, 7, 9, 14},
            {22, 19, 6, 11}
        };

        int highest = matrix[0][0];
        int lowest = matrix[0][0];

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > highest) {
                    highest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}
```
## 8. Find the Transpose of a Matrix
**Question:** WAP in java to store the number in 4 by 4 matrix in double dimensional array. Find the transpose 
of the matrix.
```java
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int n = matrix.length;

        int[][] transposeMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        // Displaying the transpose matrix
        for (int[] row : transposeMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

```

