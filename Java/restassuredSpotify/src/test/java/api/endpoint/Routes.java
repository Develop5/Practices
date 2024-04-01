package api.endpoint;

public class Routes {

    public static final String base_url = "https://api.spotify.com/v1";
    public static final String urlCurrentUser() {
        return base_url + "/me";
    }

    public static final String  BASE_PATH = "/v1";
    public static final String  API = "/api";
    public static final String  TOKEN = "/token";
    public static final String  USERS = "/users";
    public static final String  PLAYLISTS = "/playlists";

}
