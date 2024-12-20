package problem3;
import java.util.Vector;

class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }

    public void openAccount(Account account) {
        addAccount(account);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(account -> account.getAccountNumber() == accNumber);
    }

    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}