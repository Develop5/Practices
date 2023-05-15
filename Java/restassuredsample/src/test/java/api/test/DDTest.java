package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import io.restassured.response.Response;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class DDTest {
    Response response;
    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getAllData")
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
    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getAllData")
    public void testPostUser(String userId,
                             String userName,
                             String firstName,
                             String lastName,
                             String email,
                             String password,
                             String phone)
    {
        User userPayload = new User();
        userPayload.setId(Integer.parseInt(userId));
        userPayload.setUsername(userName);
        userPayload.setFirstName(firstName);
        userPayload.setLastName(lastName);
        userPayload.setEmail(email);
        userPayload.setPassword(password);
        userPayload.setPhone(phone);
        response = UserEndPoints.createUser(userPayload);
        Assertions.assertEquals(200, response.getStatusCode());
    }


    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getUserNames")
    public void testDeleteUserByName(String userName)
    {
        response = UserEndPoints.deleteUser(userName);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
