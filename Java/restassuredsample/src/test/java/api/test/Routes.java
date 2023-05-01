package api.test;

/**
 * URI -> https://petstore.swagger.io/
 * Base URL: petstore.swagger.io/v2
 * Operations about user:
 * Create user
 * Get user
 * Update user
 * Delete user
 */
public class Routes {
    // User module
    public static String base_url = "https://petstore.swagger.io/v2/";
    public static String post_url = base_url + "/user";
    public static String get_url = base_url + "/user/{username}";
    public static String update_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";


    // Store module

    // Pet module
}
