package Module3;

public class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        acc.accountNumber = 12345;
        acc.balance = 1000;

        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}