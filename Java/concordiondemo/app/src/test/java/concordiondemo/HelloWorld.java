@ExtendWith(ConcordionRunner.class)
public class HelloWorld {

    private final GreetingService greetingService = new GreetingService();

    public String greetings(final String userName) {
        return greetingService.greetings(userName);
    }

}