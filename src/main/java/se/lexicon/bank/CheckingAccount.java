package se.lexicon.bank;

public class CheckingAccount extends Account {

    private double monthlyFee;

    // Constructor
    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }

    // Process monthly fee
    @Override
    public void processMonth() {
        deduct(monthlyFee);
        System.out.println(getHolder() + ": monthly fee charged");
    }

}