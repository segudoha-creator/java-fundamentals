package se.lexicon.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private List<Account> accounts;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Process all accounts
    public void processAllAccounts() {
        for (Account account : accounts) {
            account.processMonth();
        }
    }

    // Print all account summaries
    public void printAllSummaries() {
        for (Account account : accounts) {
            account.printSummary();
        }
    }
}