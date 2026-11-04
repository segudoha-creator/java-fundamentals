package se.lexicon.bank;

public abstract class Account {

    private String holder;
    private double balance;

    // Constructor
    public Account(String holder, double balance) {

        if (holder == null || holder.isBlank()) {
            throw new IllegalArgumentException("Holder cannot be blank");
        }

        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.holder = holder;
        this.balance = balance;
    }

    // Getters
    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    // Deduct money
    protected void deduct(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        balance -= amount;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        balance += amount;
    }

    // Abstract method
    public abstract void processMonth();

    // Print account summary
    public void printSummary() {
        System.out.println(holder + " | Balance: " + balance + " kr");
    }

}