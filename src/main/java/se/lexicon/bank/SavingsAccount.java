package se.lexicon.bank;

public class SavingsAccount extends Account {

    private double interestRate;

    //Constructor
    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;

    }

    // Process monthly interest
    @Override
    public void processMonth() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println(getHolder() + ": interest credited");
    }
}