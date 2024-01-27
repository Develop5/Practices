package testspw;

import base.AbstractPlaywrightIT;
import org.junit.jupiter.api.BeforeEach;
import pages.BookViewPO;

public class BookViewIT extends AbstractPlaywrightIT {

    // Another test method.
    // IT for Integration Test
    private BookViewPO bookView;

    @BeforeEach
    public void setUp() {
        super.setUpClass();
        //bookView = getLoginPage().logIn("user", "password");
    }
}
