package week1;

public class SavingsAccount {
    public static void main(String[] args) {
        double initialBalance = 1000; // initial balance
        double interestRate = 0.05;   // 5% annual interest rate
        
        double newBalance = initialBalance * (1 + interestRate);
        
        System.out.println("Initial balance: " + initialBalance);
        System.out.println("Interest rate: " + (interestRate * 100) + "%");
        System.out.println("New balance after interest: " + newBalance);
    }
}

