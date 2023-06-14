//Create a class called BankAccount with private properties accountNumber and balance. Implement public methods to deposit, withdraw, and check the account balance. Use encapsulation to ensure that the account number and balance are only accessible and modifiable through the defined methods.
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class EncapsulationDemo2{
    public static void main(String[] args) {
        BankAccount account = new BankAccount("9986461608", 20000.0);
        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(1000.0);
        account.withdraw(12000.0);
        account.withdraw(120.0);
        account.deposit(-100.0);

        System.out.println("Final balance: " + account.getBalance());
    }
}