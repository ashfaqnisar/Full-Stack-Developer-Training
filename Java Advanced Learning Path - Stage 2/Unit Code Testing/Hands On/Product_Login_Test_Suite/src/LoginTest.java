import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTest {
    @Test
    public void methoddeleteLogin() {
        Login login1 = new Login("Bruce", "Batman");
        Login login2 = new Login("Clark", "Superman");
        Login login3 = new Login("Barry", "Flash");

        LoginDAO loginDAO = new LoginDAO();

        /*Add Login Object*/
        assertTrue(loginDAO.addLogin(login1));
        assertTrue(loginDAO.addLogin(login2));
        assertFalse(loginDAO.addLogin(null));

        login1.setUserName("Bruce");
        login1.setPassword("Password");


        /*Remove Login Object*/
        assertTrue(loginDAO.deleteLogin(login1));
        assertTrue(loginDAO.deleteLogin(login2));
        assertFalse(loginDAO.deleteLogin(null));
        assertFalse(loginDAO.deleteLogin(login3));

        System.out.println("Inside the login Test");
    }
}

