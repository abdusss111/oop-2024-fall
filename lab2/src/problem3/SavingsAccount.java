package problem3;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public String toString() {
        return super.toString() + ", interest: " + interestRate;
    }
}