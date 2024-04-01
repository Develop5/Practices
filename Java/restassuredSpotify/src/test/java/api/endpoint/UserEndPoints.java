package api.endpoint;

import api.payload.User;
import api.utilities.ConfigLoader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

// CRUD for the user
public class UserEndPoints {
    public static Response response;

    public static Response readMyUser()
    {
        System.out.println("\n+++++++++ Lourdes Command: " + Routes.urlCurrentUser());
        System.out.println("+++++++++ Lourdes Header: " + ConfigLoader.getInstance().getAccessToken());
        System.out.println();
        response = given().
                //auth().basic("lbp", ConfigLoader.getInstance().getAccessToken()).
                contentType(ContentType.JSON).
                accept(ContentType.JSON).

                header("Authorization: ", "Bearer " +  ConfigLoader.getInstance().getAccessToken()).

                when().
                get(Routes.urlCurrentUser());
        return response;
    }


}
