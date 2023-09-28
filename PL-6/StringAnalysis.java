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