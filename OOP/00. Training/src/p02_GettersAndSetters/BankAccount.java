package p02_GettersAndSetters;

public class BankAccount {
    private int id;
    private double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    private void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }


    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return String.format("Account %s, balance %.2f",this.id,this.balance);
    }
}
