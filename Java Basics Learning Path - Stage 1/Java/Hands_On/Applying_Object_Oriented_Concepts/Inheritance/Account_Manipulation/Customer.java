package Hands_On.Applying_Object_Oriented_Concepts.Inheritance.Account_Manipulation;
/*Remove the package import from the code in genc learn*/

public class Customer {
    //Attributes
    private int customerId;
    private String customerName;
    private String emailId;

    //Constructor
    public Customer(int customerId, String customerName, String emailId) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.emailId = emailId;
    }

    //Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

}
