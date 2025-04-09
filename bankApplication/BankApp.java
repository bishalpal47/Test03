package bankApplication;

// Main Application Class
public class BankApp {
    public static void main(String[] args) {
        BankManagementSystem bankSystem = new BankManagementSystem();

        // Creating sample accounts
        bankSystem.createAccount("1001", "John Doe", BankAccount.AccountType.SAVINGS, 1000.00);
        bankSystem.createAccount("1002", "Jane Smith", BankAccount.AccountType.CHECKING, 2000.00);

        // Performing operations
        bankSystem.depositToAccount("1001", 500.00);
        bankSystem.withdrawFromAccount("1002", 300.00);

        // Display all accounts
        bankSystem.displayAllAccounts();
    }
}