package p03_TestClient;

public class BankAccount {
    private int id;
    private double balance;

    protected BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    protected double getBalance() {
        return this.balance;
    }

    public int getId() {
        return this.id;
    }

    protected void deposit(double amount) {
        this.balance += amount;
    }

    protected void withdraw(double amount) {
        this.balance -= amount;
    }


    @Override
    public String toString() {
        return String.format("Account ID%d, balance %.2f",getId(),getBalance());
    }
}
