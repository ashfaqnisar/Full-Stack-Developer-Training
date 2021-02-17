package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Account_Manipulation;
/*Remove the package import from the code in genc learn*/

public class SavingsAccount extends Account {
    private double minimumBalance;


    //Uncomment the getters and setters after writing the attributes


    public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
        super(accountNumber, customerObj, balance);
        this.minimumBalance = minimumBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }


    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) > minimumBalance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
}

