package se.lexicon.bank;

public class LoanAccount extends Account {

    private double loanRate;

    // Constructor
    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    // Process monthly loan interest
    @Override
    public void processMonth() {
        double interest = getBalance() * loanRate;
        deposit(interest);
        System.out.println(getHolder() + ": loan interest added");
    }

}