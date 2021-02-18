import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void checkAadhaar() {
        assertFalse(Customer.isValidAadharNo("012345678912"));
        assertFalse(Customer.isValidAadharNo("1234567890123456"));
        assertTrue(Customer.isValidAadharNo("987654321012"));
    }

    @Test
    public void checkNames() {
        Customer customer1 = new Customer(
                "2345678901234567",
                "Bruce",
                "Wayne",
                "Cave",
                123456789,
                "bruce@batman.com");

        assertNotEquals(customer1.getFirstName(), customer1.getLastName());
    }

    @Test
    public void checkEmailId() {
        Customer customer1 = new Customer(
                "312345678912",
                "Bruce",
                "Wayne",
                "Cave",
                123456789,
                "bruce@batman.com");

        Customer customer2 = new Customer(
                "212345678912",
                "Bruce",
                "Wayne",
                "Cave",
                123456789,
                "clark@superman.com");

        assertNotNull(customer1.getEmailId());
        assertNotNull(customer2.getEmailId());
    }

}
