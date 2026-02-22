package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

// CRUD for the user
public class UserEndPoints2 {
    public static Response response;

    static ResourceBundle getURL() {
        ResourceBundle routes = ResourceBundle.getBundle("routes");
        System.out.println(" Routes : " + routes);
        return routes;
    }

    public static Response createUser(User payload)
    {
        String post_url = getURL().getString("post_url");
        response = given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(payload).
        when().
                post(post_url);
        return response;
    }
    public static Response readUser(String userName)
    {
        String get_url = getURL().getString("get_url");
        response = given().
                pathParam("username", userName).
                //pathParam("username", "Alberto").  //Have one created
        when().
                get(get_url);
        return response;
    }
    public static Response updateUser(String userName, User payload)
    {
        String update_url = getURL().getString("update_url");
        response = given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                pathParam("username", userName).
                body(payload).
        when().
                put(update_url);
        return response;
    }

    public static Response deleteUser(String userName)
    {
        String delete_url = getURL().getString("delete_url");
        response = given().
                pathParam("username", userName).
        when().
                delete(delete_url);
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
