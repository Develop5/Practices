package concordiondemo;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;


@RunWith(ConcordionRunner.class)
public class HelloWorld {
    public final GreetingService greetingService = new GreetingService();
    public String greetings(final String userName) {
        return greetingService.greetings(userName);
    }
}
