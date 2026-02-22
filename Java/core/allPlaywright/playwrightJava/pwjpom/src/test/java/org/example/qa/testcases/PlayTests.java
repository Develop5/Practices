package org.example.qa.testcases;

import org.example.qa.base.BaseTests;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayTests extends BaseTests {

    @Test
    @Order(1)
    public void verifyTitle() {
        assertEquals(page.title(), "My Store");
    }

    @Test
    @Order(2)
    public void verifySearch() {
        search = hp.search("dress");
        page.keyboard().press("Enter");
        assertEquals(search.getSearchText().trim().toLowerCase(), "\"dress\"");
    }
}
