package api.test;

import api.endpoint.UserEndPoints;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class UserTests {
    Response response;
    static Logger logger;

    @BeforeAll
    public static void loggerPreparation() {
        logger = LogManager.getLogger(UserTests.class);
    }


    @Test
    public void testGetUser() {
        logger.info("*****  Getting info about the current user  **** " );

        response = UserEndPoints.readMyUser();

        response.then().log().all();
        Assertions.assertEquals(200, response.getStatusCode());
    }

}
