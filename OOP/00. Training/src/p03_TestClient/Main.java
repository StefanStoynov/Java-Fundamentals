package p03_TestClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> accounts = new HashMap<>();
        String line;
        while (true) {
            if ("End".equals(line = reader.readLine())) {
                break;
            }
            String[] accountTokens = line.split("\\s+");
            String command = accountTokens[0];
            int id = Integer.parseInt(accountTokens[1]);
            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount(id);

                    if (accounts.containsKey(id)) {
                        System.out.println("Account already exists");
                    } else {
                        accounts.putIfAbsent(account.getId(), account);
                    }
                    break;

                case "Deposit":
                    double amount = Double.parseDouble(accountTokens[2]);
                    if (accounts.containsKey(id)) {
                        accounts.get(id).deposit(amount);
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;

                case "Withdraw":
                    double amountWithdraw = Double.parseDouble(accountTokens[2]);
                    if (accounts.containsKey(id)) {
                        if (amountWithdraw > accounts.get(id).getBalance()) {
                            System.out.println("Insufficient balance");
                            break;
                        }
                        accounts.get(id).withdraw(amountWithdraw);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;

                case "Print":
                    if (accounts.containsKey(id)) {
                        System.out.println(accounts.get(id).toString());
                    } else {
                        System.out.println("Account does not exist");
                    }


            }


        }

    }
}
