package problem3;

public class Test {

	public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount savings1 = new SavingsAccount(1001, 2.5);
        CheckingAccount checking1 = new CheckingAccount(1002);

        savings1.deposit(1000);
        checking1.deposit(500);
        checking1.withdraw(50);

        bank.openAccount(savings1);
        bank.openAccount(checking1);

        bank.update();
        bank.printAccounts();
    }
}
