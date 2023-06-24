package api.test;

import api.endpoints.UserEndPoints2;
import api.payload.User;
import api.utilities.ExtentReportManager;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


/*
Start using log4j2
https://sematext.com/blog/log4j2-tutorial/
 */
@ExtendWith(ExtentReportManager.class)
public class UserTests2 {
    Faker faker;
    User userPayload;
    String usernameForFirstTime = "Alberto";
    Response response;
    Logger logger;


    @BeforeEach
    public void setupData() {

        faker = new Faker();
        userPayload = new User();
        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(usernameForFirstTime);
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password(5, 10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());
        logger = LogManager.getLogger(this.getClass());

    }

    @Test
    public void testPostUser() {
        logger.info("*****  Creating user  ***** " + this.userPayload.getUsername()) ;
        response = UserEndPoints2.createUser(userPayload);
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testGetUserByName() {
        logger.info("*****  Getting user info by name. UserTest2  **** " + usernameForFirstTime);        // response = UserEndPoints2.readUser(this.userPayLoad.getUsername());
        response = UserEndPoints2.readUser(usernameForFirstTime);        // Needs to be after Post
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testLogUserIntoSystem() {
        logger.info("*****  Log User into system. UserTests2  **** " + this.userPayload.getUsername());
        response = UserEndPoints2.logUser(this.userPayload.getUsername(), this.userPayload.getPassword());
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testUpdateUser() {
        // Going to generate details: firstname, lastname and email to update user
        String newFirstName = faker.name().firstName();
        String newLastName = faker.name().lastName();
        String newEmail = faker.internet().safeEmailAddress();
        userPayload.setFirstName(newFirstName);
        userPayload.setLastName(newLastName);
        userPayload.setEmail(newEmail);

        logger.info("*****  Update User. UserTests2  **** "
                + this.userPayload.getUsername() + "  "
                + userPayload);
        // Using details generated to update user in the global field
        response = UserEndPoints2.updateUser(this.userPayload.getUsername(), userPayload);
        response.then().log().body();
        Assertions.assertEquals(200, response.getStatusCode());
        logger.info("*****  User update command successful. UserTest2  ****");

        // Checking data after update
        Response responseAfterUpdate = UserEndPoints2.readUser(this.userPayload.getUsername());
        responseAfterUpdate.then().log().body();
        Assertions.assertEquals(200, responseAfterUpdate.getStatusCode());
        String responseAfterUpdateUsername = responseAfterUpdate.getBody().path("username").toString();
        // Compare class field with result of reading from the endpoint
        Assertions.assertEquals(this.userPayload.getUsername(), responseAfterUpdateUsername);
        logger.info("*****  User updated and checked. UserTests2  ****");
    }

    @Test
    public void deleteUserByName() {
        logger.info("*****  Delete user. UserTests2  **** " + this.userPayload.getUsername());
        response = UserEndPoints2.deleteUser(this.userPayload.getUsername());
        Assertions.assertEquals(200, response.getStatusCode());
    }
}