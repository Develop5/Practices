package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.ExtentReportManager;
import io.restassured.response.Response;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
@ExtendWith(ExtentReportManager.class)
@DisplayName("4 tests per 3 users = 12 total")
public class DDTest {
    Response response;
    @Order(1)
    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getAllData")
    @DisplayName("DDTest each user has all fields")
    public void testWithAllData(String userId,
                                String userName,
                                String firstName,
                                String lastName,
                                String email,
                                String password,
                                String phone)
    {
        assertTrue(Strings.isNotBlank(userId));            // Change this to simulate
        assertTrue(Strings.isNotBlank(userName));
        assertTrue(Strings.isNotBlank(firstName));
        assertTrue(Strings.isNotBlank(lastName));
        assertTrue(Strings.isNotBlank(email));
        assertTrue(Strings.isNotBlank(password));
        assertTrue(Strings.isNotBlank(phone));
    }
    @Order(2)
    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getAllData")
    @DisplayName("DDTest post each user")
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
        assertEquals(200, response.getStatusCode());
    }

    @Order(3)
    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getUserNames")
    @DisplayName("DDTest delete each user")
    public void testDeleteUserByName(String userName)
    {
        response = UserEndPoints.deleteUser(userName);
        assertEquals(200, response.getStatusCode());
    }

    @Order(4)
    @ParameterizedTest
    @MethodSource("api.utilities.DataProviders#getUserNames")
    @DisplayName("DDTest able to get each user")
    public void testGetUsers(String userName)
    {
        response = UserEndPoints.readUser(userName);
        assertEquals(200, response.getStatusCode());
    }

}
