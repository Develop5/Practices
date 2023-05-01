package api.endpoints;

import javax.annotation.Nullable;

/**
 * URI -> https://petstore.swagger.io/
 * Base URL: petstore.swagger.io/v2
 * Operations about user:
 * Create user
 * Get user
 * Update user
 * Delete user
 */public class Routes{
    // User module
    public static String base_url = "https://petstore.swagger.io/v2";
    public static String urlUser() {
        return base_url + "/user";
    }

    public static String urlUserWithUsernameParameter() {
        return base_url + "/user/{username}" ;
    }


    // Store module

    // Pet module
}
