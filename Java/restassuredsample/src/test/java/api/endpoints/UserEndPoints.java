package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

// CRUD for the user
public class UserEndPoints {
    public static Response response;


    public static Response createUser(User payload)
    {
        response = given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(payload).
        when().
                post(Routes.urlUser());
        return response;
    }
    public static Response readUser(String userName)
    {
        response = given().
                pathParam("username", userName).
                //pathParam("username", "Alberto").  //Have one created
        when().
                get(Routes.urlUserWithUsernameParameter());
        return response;
    }
    public static Response updateUser(String userName, User payload)
    {
        response = given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                pathParam("username", userName).
                body(payload).
        when().
                put(Routes.urlUserWithUsernameParameter());
        return response;
    }

    public static Response deleteUser(String userName)
    {
        response = given().
                pathParam("username", userName).
        when().
                delete(Routes.urlUserWithUsernameParameter());
        return response;
    }

    public static Response logUser(String userName, String userPassword)
    {
        response = given().
                pathParam("username", userName).
                pathParam("password", userPassword).
                when().
                get(Routes.urlLogin());
        return response;
    }

}
