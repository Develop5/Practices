package api.test;

import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class DDTest {

    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getAllData")
    //public void testWithAllData(String apiData)
    public void testWithAllData(String userId,
                                String userName,
                                String firstName,
                                String lastName,
                                String email,
                                String password,
                                String phone)
    {
        assertTrue(Strings.isNotBlank(userId));
        assertTrue(Strings.isNotBlank(userName));
        assertTrue(Strings.isNotBlank(firstName));
        assertTrue(Strings.isNotBlank(lastName));
        assertTrue(Strings.isNotBlank(email));
        assertTrue(Strings.isNotBlank(password));
        assertTrue(Strings.isNotBlank(phone));
        System.out.println(String.format("%-12s %-12s %-12s %-12s %-12s %-12s %-12s", userId, userName, firstName, lastName, email, password, phone));
    }

}
