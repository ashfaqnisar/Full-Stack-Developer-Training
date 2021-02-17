package Hands_On.Applying_Object_Oriented_Concepts.Classes_And_Objects.Bank_Account_Details;
/*Remove the package import from the code in genc learn*/

public class Account {
    private int accountId;
    private String accountType;
    private int balance;

    public int getAccountId() {
        return accountId;

    }

    public void setAccountId(int id) {
        accountId = id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String s) {
        accountType = s;
    }

    public int getBalance() {
        return balance;

    }

    public void setBalance(int b) {
        balance = b;
    }

    public boolean withdraw(int w) {
        if (getBalance() < w) {
            System.out.println("Sorry!!! No enough balance");
            return false;
        } else {
            System.out.println("Balance amount after withdraw: " + (getBalance() - w));
            return true;
        }
    }
}
