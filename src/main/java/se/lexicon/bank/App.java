package se.lexicon.bank;

public class App {

    public static void main(String[] args) {

        // Create a bank
        Bank bank = new Bank("Lexicon Bank");

        // Create accounts
        SavingsAccount savings = new SavingsAccount("Anna", 1000, 0.02);
        CheckingAccount checking = new CheckingAccount("Erik", 500, 25);
        LoanAccount loan = new LoanAccount("Sara", 5000, 0.03);

        // Add accounts to the bank
        bank.addAccount(savings);
        bank.addAccount(checking);
        bank.addAccount(loan);

        // Print initial balances
        System.out.println("=== Initial balances ===");
        bank.printAllSummaries();

        // Process one month
        System.out.println("\n=== Processing one month ===");
        bank.processAllAccounts();

        // Print final balances
        System.out.println("\n=== Final balances ===");
        bank.printAllSummaries();
    }
}