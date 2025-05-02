package balance;

import balance.Account;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account(5000.00);
        myAccount.Display_Balance();
    }
}
