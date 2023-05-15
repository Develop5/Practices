package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTests {
    Faker faker;
    User userPayload;
    String usernameForFirstTime = "Alberto";
    Response response;

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
    }

    @Test
    public void testPostUser() {
        response = UserEndPoints.createUser(userPayload);
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testGetUserByName() {
        // response = UserEndPoints.readUser(this.userPayLoad.getUsername());
        response = UserEndPoints.readUser(usernameForFirstTime);
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testLogUserIntoSystem() {
        response = UserEndPoints.logUser(this.userPayload.getUsername(), this.userPayload.getPassword());
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

        // Using details generated to update user in the global field
        response = UserEndPoints.updateUser(this.userPayload.getUsername(), userPayload);
        response.then().log().body();
        Assertions.assertEquals(200, response.getStatusCode());

        // Checking data after update
        Response responseAfterUpdate = UserEndPoints.readUser(this.userPayload.getUsername());
        responseAfterUpdate.then().log().body();
        Assertions.assertEquals(200, responseAfterUpdate.getStatusCode());
        String responseAfterUpdateUsername = responseAfterUpdate.getBody().path("username").toString();
        // Compare class field with result of reading from the endpoint
        Assertions.assertEquals(this.userPayload.getUsername(), responseAfterUpdateUsername);
    }

    @Test
    public void deleteUserByName() {
        response = UserEndPoints.deleteUser(this.userPayload.getUsername());
        Assertions.assertEquals(200, response.getStatusCode());
    }
}