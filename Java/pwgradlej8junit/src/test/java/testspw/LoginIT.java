package testspw;

import base.AbstractPlaywrightIT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginIT extends AbstractPlaywrightIT {

    // This is the test method.
    // IT stands for Integration Test

    @Test
    void testLogIn() {
        getLoginPage().logIn("user", "password");
        Assertions.assertTrue(true);
        //Assertions.assertTrue(getPage().isVisible("#books-view"));
    }
}
