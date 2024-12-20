package problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        }
        else if (sum < 0) System.out.println("invalid sum");
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        }
        else System.out.println("insufficient funds");
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }
        else System.out.println("insufficient funds");
    }

    public String toString() {
        return "account: " + accNumber + ", balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}
