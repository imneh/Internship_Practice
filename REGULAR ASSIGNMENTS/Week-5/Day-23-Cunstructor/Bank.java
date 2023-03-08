import java.util.*;

class Bank {
  String bank_name;
  String bank_type;
  long account_number;
  double balance = 2000;
  double withdraw_amt;
  double deposit;


  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the bank name");
    bank_name = sc.next();
    System.out.println("enter the type of account");
    bank_type = sc.next();
    System.out.println("enter the account number");
    account_number = sc.nextLong();
    System.out.println("the balance in account is:-" + balance);
    System.out.println("enter the money you want to withdraw");
    withdraw_amt = sc.nextDouble();
  }

  void calculate() {
    if (withdraw_amt > balance) {
      System.out.println("insufficient balance");
    } else {
      balance = balance - withdraw_amt;
      System.out.println("current balance in your account is:-" + balance);
    }
  }

  void display() {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the money you want to deposit");
    deposit = sc.nextDouble();
    balance = deposit + balance;
    System.out.println("the balance in your account is :-" + balance);
  }
}

public class Bankmain {

  public static void main(String args[]) {
    Bank account1 = new Bank();
    account1.read();
    account1.calculate();
    account1.display();
  }
}