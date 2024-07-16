package pages;

import com.microsoft.playwright.Page;

public class LoginPO {
    // A page. In this case, the login page
    private final Page page;

    public LoginPO(Page page) {
        this.page = page;
    }

    public void logIn(String username, String password) {
        System.out.println("--> I am in the login page");
        System.out.println("------->  Locators and actions in this page");
        System.out.println("----- Username: " + username);
        System.out.println("----- Password: " + password);
    }


    //public pages.BookViewPO logIn(String username, String password) {
    //    return new pages.BookViewPO(page);
    //}





}
