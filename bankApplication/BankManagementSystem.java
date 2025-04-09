package bankApplication;

import java.util.ArrayList;
import java.util.List;

// Bank Management System Class
class BankManagementSystem {
    private List<BankAccount> accounts;

    public BankManagementSystem() {
        accounts = new ArrayList<>();
    }

    // Create a new bank account
    public void createAccount(String accountNumber, String accountHolderName,
                              BankAccount.AccountType accountType, double initialBalance) {
        // Check if account number already exists
        if (findAccount(accountNumber) != null) {
            System.out.println("Account number already exists.");
            return;
        }

        BankAccount newAccount = new BankAccount(accountNumber, accountHolderName,
                accountType, initialBalance);
        accounts.add(newAccount);
        System.out.println("Account created successfully.");
    }

    // Find account by account number
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    // Deposit money to an account
    public void depositToAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money from an account
    public void withdrawFromAccount(String accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        for (BankAccount account : accounts) {
            System.out.println(account);
            System.out.println("------------------------");
        }
    }
}