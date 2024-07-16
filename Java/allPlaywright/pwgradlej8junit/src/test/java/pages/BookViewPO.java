package pages;

import com.microsoft.playwright.Page;

import java.time.LocalDate;

public class BookViewPO {

    private final Page page;

    public BookViewPO(Page page) {
        this.page = page;
        System.out.println("--> Enable the following command, to wait for the selector");
        //page.waitForSelector("#books-view");
    }

    //public pages.BookViewPO logIn(String username, String password) {
    //    return new pages.BookViewPO(page);
    //}


    public void fillBook(String name, String author, LocalDate date, int pages, String isbn) {
        System.out.println("----> Name: " + name);
        System.out.println("----> author: " + author);
        System.out.println("----> date: " + date);
        System.out.println("----> pages: " + pages);
        System.out.println("----> isbn: " + isbn);
        System.out.println();
        System.out.println("Intended to do a page.type(\"*css=vaadin-text-field >> 'Name'\", name);");
    }

    public void save() {
        System.out.println();
        System.out.println("Intended to do a page.click(\"'Save'\");");

    }


}
