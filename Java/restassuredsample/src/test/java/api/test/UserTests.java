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
    User userPayLoad;
    @BeforeEach
    public void setupData() {
        faker = new Faker();
        userPayLoad = new User();
        userPayLoad.setId(faker.idNumber().hashCode());
        userPayLoad.setUsername(faker.name().username());
        userPayLoad.setFirstName(faker.name().firstName());
        userPayLoad.setLastName(faker.name().lastName());
        userPayLoad.setEmail(faker.internet().safeEmailAddress());
        userPayLoad.setPassword(faker.internet().password(5,10));
        userPayLoad.setPhone(faker.phoneNumber().cellPhone());
    }

    @Test
    public void testPostUser()
    {
        Response response = UserEndPoints.createUser(userPayLoad);
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

    @Test
    public void testGetUserByName()
    {
        Response response = UserEndPoints.readUser(this.userPayLoad.getUsername());
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }
    @Test
    public void testLogUserIntoSystem()
    {
        Response response = UserEndPoints.logUser(this.userPayLoad.getUsername(), this.userPayLoad.getPassword());
        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
