package steps;

import model.Category;
import net.thucydides.core.annotations.Steps;

public class NavigatingUser {

    // "Steps" annotation not working
    //@Steps
    public void isOnTheHomePage() {
    }

    //@Steps
    public void shouldSeePageTitleContaining(String expectedTitle) {
    }

    //@Steps
    public void navigatesToCategory(Category category) {
    }
}
