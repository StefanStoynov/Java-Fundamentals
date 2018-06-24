package p01_DefineBankAccountClass;

public class BankAccount {
    public int id;
    public double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account Id %d, balance %.2f",this.id,this.balance);
    }
}
