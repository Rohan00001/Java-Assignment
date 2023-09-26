import java.util.Scanner;

public class Relatives {
    String[] names;
    String[] addresses;
    
    // Constructor to initialize the relatives object
    public Relatives(int numRelatives) {
        names = new String[numRelatives];
        addresses = new String[numRelatives];
    }
    
    // Method to input names and addresses from keyboard
    public void inputRelativesData() {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name of relative " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter address of relative " + (i + 1) + ": ");
            addresses[i] = scanner.nextLine();
        }
        
        scanner.close();
    }
    
    // Method to display names and addresses of relatives
    public void displayRelativesData() {
        System.out.println("Relatives:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int numRelatives = 3; // Change this to the desired number of relatives
        Relatives relatives = new Relatives(numRelatives);
        
        relatives.inputRelativesData();
        relatives.displayRelativesData();
    }
}