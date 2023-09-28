

**1. Count Vowels in a String:**
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

**2. Check Palindrome Word:**
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

**3. Count Blank Spaces, Words, and Characters:**
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

**4. Convert String to Uppercase:**
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

**5. Find Maximum and Minimum in an Array:**
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

**6. Bubble Sort for Array:**
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

**7. Find Highest and Lowest in a Matrix:**
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

