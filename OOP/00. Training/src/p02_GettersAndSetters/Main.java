package p02_GettersAndSetters;



public class Main {
    public static void main(String[] args) {


        BankAccount acc = new BankAccount(1,20);
        acc.deposit(10);
        acc.withdraw(30);
        System.out.println(acc.toString());
    }
}
