package ro.mirodone;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double ibalance, String accountNumber) {
        this.balance = ibalance;
        this.accountNumber = accountNumber;
    }

 // option 1
/*    public synchronized void deposit (double amount){
        balance += amount;
    }

    public synchronized void withdraw (double amount){
        balance -= amount;
    }*/

    public  void deposit (double amount){
        synchronized (this){
            balance += amount;
        }
    }

    public  void withdraw (double amount) {
        synchronized (this) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}
