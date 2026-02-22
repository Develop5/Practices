import base.AbstractPlaywrightIT;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.BookViewPO;

public class BookViewIT extends AbstractPlaywrightIT {

    // Another test method.
    // IT for Integration Test
    private BookViewPO bookView;


    // User BeforeEach and AfterEach only if the browser needs to be reloaded per test
    /*
    @BeforeEach
    public void setUp() {
        super.setUpClass();
        System.out.println("-----> BeforeEach:  " + getClass().getSimpleName());
        //bookView = getLoginPage().logIn("user", "password");
    }

    @AfterEach
    public void tearDown() throws Exception {
        super.tearDownClass();
        System.out.println("-----> AfterEach:  " + getClass().getSimpleName());
    }
     */

    @Test
    public void test3InBookViewIT(){
        System.out.println("-----> test3InBookViewIT:  " + getClass().getSimpleName());
    }

    @Test
    public void test4InBookViewIT(){
        System.out.println("-----> test4InBookViewIT:  " + getClass().getSimpleName());
    }

}
