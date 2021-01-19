import java.util.Scanner;

class Account {
    private int accountId, balance;
    private String accountType;

    public Account() {
    }

    public Account(int accountId) {
        this.accountId = accountId;
    }

    public Account(int accountId, int balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public Account(int accountId, int balance, String accountType) {
        this.accountId = accountId;
        this.balance = balance;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance amount after withdraw: " + balance);
            return true;
        }
        System.out.println("Sorry!!! No enough balance");
        return false;
    }
}

public class AccountDetails {
    static Scanner sc = new Scanner(System.in);

    public static Account getAccountDetails() {
        Account account = new Account();
        System.out.println("Enter account id:");
        account.setAccountId(sc.nextInt());

        System.out.println("Enter account type:");
        account.setAccountType(sc.next());


        System.out.println("Enter balance:");
        int balance = sc.nextInt();
        while (balance <= 0) {
            System.out.println("Balance should be positive");
            System.out.println("Enter balance:");
            balance = sc.nextInt();
        }
        account.setBalance(balance);
        return account;
    }

    public static int getWithdrawAmount() {
        System.out.println("Enter amount to be withdrawn:");
        int amountToBeWithdrawn = sc.nextInt();
        while (amountToBeWithdrawn <= 0) {
            System.out.println("Amount should be positive");
            System.out.println("Enter amount to be withdrawn:");
            amountToBeWithdrawn = sc.nextInt();
        }
        return amountToBeWithdrawn;
    }

    public static void main(String[] args) {
        Account account = getAccountDetails();
        account.withdraw(getWithdrawAmount());
    }
}
