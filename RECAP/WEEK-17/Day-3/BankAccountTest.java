interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void displayAccountInfo();
}

class BankAccount implements Account {
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance =balance - amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: $" + balance);
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, String name, double balance, double interestRate) {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied:" + interest);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456", "Salman", 1000.0);
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.displayAccountInfo();

        SavingAccount account2 = new SavingAccount("789012", "Ronaldo messi", 2000.0, 0.05);
        account2.deposit(1000.0);
        account2.applyInterest();
        account2.displayAccountInfo();
    }
}