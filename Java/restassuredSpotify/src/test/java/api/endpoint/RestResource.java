package api.endpoint;


import io.restassured.response.Response;
import java.util.HashMap;


import static api.endpoint.Routes.API;
import static api.endpoint.Routes.TOKEN;
import static api.endpoint.SpecBuilder.*;
import static io.restassured.RestAssured.given;



public class RestResource {


    public static Response post(String path, String token, Object requestPlaylist) {
        return given(getRequestSpec())
                .body(requestPlaylist)
                .header("Authorization", "Bearer " + token)
                .when()
                .post(path)
                .then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response get(String path, String token) {
        return given(getRequestSpec())
                .when()
                .header("Authorization", "Bearer " + token)
                .get(path)
                .then().spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response update(String path, Object requestPlaylist, String token) {
        return given(getRequestSpec())
                .body(requestPlaylist)
                .when()
                .header("Authorization", "Bearer " + token)
                .put(path)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response postAccount(HashMap<String, String> formParams) {
        return given(getAccountRequestSpec())
                .formParams(formParams)
                .when()
                .post(API + TOKEN)
                .then().spec(getResponseSpec())
                .extract().response();
    }
}
