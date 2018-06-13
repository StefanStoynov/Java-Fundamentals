package p01_DefineBankAccountClass;

public class BankAccount {
    public int id;
    public double balance;

    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double Withdraw(double amount){
        if (this.balance<amount){
            System.out.println("Insufficient balance");
        }else{
            this.balance -= amount;
        }
        return balance;
    }
    public  double Deposit ( double amount){
        return 0.0;
    }
}
