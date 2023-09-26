# Java Programming PL-2
## Task 1: Student Class

Create a Java program to implement a class called `Student` with the following members:
- Name of the student
- Marks of the student

Include the following methods:
- Method to assign initial values
- Method to compute total average
- Method to display the data

Write an appropriate `main()` method to demonstrate the usage of the `Student` class.

```java
public class Student {
    String name;
    double[] marks;
    
    // Constructor to initialize the student object
    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }
    
    // Method to compute the total and average marks
    public void computeTotalAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;
        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
    
    // Method to display student data
    public void displayData() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
    }
    
    public static void main(String[] args) {
        double[] studentMarks = { 90, 85, 78, 92, 88 };
        Student student = new Student("John", studentMarks);
        
        student.displayData();
        student.computeTotalAverage();
    }
}

```

## Task 2: BankAccount Class

Declare a Java class called `BankAccount` with the following variables:
- Account Holder's Name
- Account number
- Account type (S for Savings and C for Current)
- Balance amount

Add a constructor for the class and include the following methods:
- Method to initialize data
- Method to deposit money
- Method to withdraw money (with a minimum deposit requirement of Rs. 1,000)
- Method to display all data

Write an appropriate `main()` method to run and test the `BankAccount` class.


```java
public class BankAccount {
    String accountHolderName;
    String accountNumber;
    char accountType;
    double balance;
    
    // Constructor to initialize the bank account
    public BankAccount(String accountHolderName, String accountNumber, char accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: Rs. " + amount);
        } else {
            System.out.println("Insufficient balance to withdraw Rs. " + amount);
        }
    }
    
    // Method to display account data
    public void displayData() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: Rs. " + balance);
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", "1234567890", 'S', 5000);
        
        account.displayData();
        account.deposit(2000);
        account.withdraw(1500);
    }
}


```
## Task 3: Clock Class

Create a Java class called `Clock` with the following variables:
- Hour in integer value
- Minutes in integer value

Include a constructor for the class and the following methods:
- Method to read time (`int h, int m`)
- Method to show time

Create two `Clock` objects, and print the difference in time between them.
```java
public class Clock {
    int hour;
    int minutes;
    
    // Constructor to initialize the clock
    public Clock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }
    
    // Method to read time
    public void readTime(int h, int m) {
        hour = h;
        minutes = m;
    }
    
    // Method to show time
    public void showTime() {
        System.out.println("Time: " + hour + " hours " + minutes + " minutes");
    }
    
    public static void main(String[] args) {
        Clock clock1 = new Clock(10, 30);
        Clock clock2 = new Clock(12, 45);
        
        clock1.showTime();
        clock2.showTime();
        
        int differenceHours = Math.abs(clock1.hour - clock2.hour);
        int differenceMinutes = Math.abs(clock1.minutes - clock2.minutes);
        
        System.out.println("Time Difference: " + differenceHours + " hours " + differenceMinutes + " minutes");
    }
}
```

## Task 4: Relatives Class

Create a Java class called `Relatives` with two members:
- Names of relatives
- Addresses of relatives

Include different methods for inputting data from the keyboard and displaying names and addresses of different relative instances.

Here's a Markdown file with the Java programs for the tasks you've described:

```java
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
```

