package bankApplication;

// Bank Account Class
class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private AccountType accountType;

    // Enum for different account types
    public enum AccountType {
        SAVINGS, CHECKING, BUSINESS
    }

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName,
                       AccountType accountType, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdrawal method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    // ToString method for account details
    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nAccount Holder: " + accountHolderName +
                "\nAccount Type: " + accountType +
                "\nBalance: $" + balance;
    }
}
