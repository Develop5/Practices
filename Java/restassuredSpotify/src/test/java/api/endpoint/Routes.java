package api.endpoint;

public class Routes {

    public static String base_url = "https://api.spotify.com/v1/";
    public static String urlCurrentUser() {
        return base_url + "/me";
    }

}
