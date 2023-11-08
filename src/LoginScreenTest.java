import static org.junit.Assert.*;
import org.junit.Test;

public class LoginScreenTest {

    public static void main(String[] args) {
    }

    @Test
    public void testSuccessFullLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("john", "password123"));
    }
    
    @Test
    public void testFailedLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertFalse(loginScreen.login("john", "wrongpassword"));
    }
    
    @Test
    public void testAddUser() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.AddUser("testuser", "testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
    }
}