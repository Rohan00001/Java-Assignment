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