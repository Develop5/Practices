package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTests {
    Faker faker;
    User userPayLoad;
    String usernameForFirstTime = "Alberto";

    @BeforeEach
    public void setupData() {

        faker = new Faker();
        userPayLoad = new User();
        userPayLoad.setId(faker.idNumber().hashCode());
        userPayLoad.setUsername(usernameForFirstTime);
        userPayLoad.setFirstName(faker.name().firstName());
        userPayLoad.setLastName(faker.name().lastName());
        userPayLoad.setEmail(faker.internet().safeEmailAddress());
        userPayLoad.setPassword(faker.internet().password(5, 10));
        userPayLoad.setPhone(faker.phoneNumber().cellPhone());
    }

    @Test
    public void testPostUser() {
        Response response = UserEndPoints.createUser(userPayLoad);
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testGetUserByName() {
        //Response response = UserEndPoints.readUser(this.userPayLoad.getUsername());
        Response response = UserEndPoints.readUser(usernameForFirstTime);
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testLogUserIntoSystem() {
        Response response = UserEndPoints.logUser(this.userPayLoad.getUsername(), this.userPayLoad.getPassword());
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testUpdateUser() {
        // Going to generate details: firstname, lastname and email to update user
        String newFirstName = faker.name().firstName();
        String newLastName = faker.name().lastName();
        String newEmail = faker.internet().safeEmailAddress();
        userPayLoad.setFirstName(newFirstName);
        userPayLoad.setLastName(newLastName);
        userPayLoad.setEmail(newEmail);

        // Using details generated to update user in the global field
        Response response = UserEndPoints.updateUser(this.userPayLoad.getUsername(), userPayLoad);
        response.then().log().body();
        Assertions.assertEquals(200, response.getStatusCode());

        // Checking data after update
        Response responseAfterUpdate = UserEndPoints.readUser(this.userPayLoad.getUsername());
        responseAfterUpdate.then().log().body();
        Assertions.assertEquals(200, responseAfterUpdate.getStatusCode());
        String responseAfterUpdateUsername = responseAfterUpdate.getBody().path("username").toString();
        // Compare class field with result of reading from the endpoint
        Assertions.assertEquals(this.userPayLoad.getUsername(), responseAfterUpdateUsername);


    }
}