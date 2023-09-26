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
