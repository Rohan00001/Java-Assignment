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
