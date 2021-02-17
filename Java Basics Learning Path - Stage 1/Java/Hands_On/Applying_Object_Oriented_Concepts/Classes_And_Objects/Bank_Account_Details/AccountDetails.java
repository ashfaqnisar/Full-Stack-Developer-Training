package Hands_On.Applying_Object_Oriented_Concepts.Classes_And_Objects.Bank_Account_Details;
/*Remove the package import from the code in genc learn*/

import java.util.Scanner;

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
        int withdrawAmount = getWithdrawAmount();
        account.withdraw(withdrawAmount);
    }
}
