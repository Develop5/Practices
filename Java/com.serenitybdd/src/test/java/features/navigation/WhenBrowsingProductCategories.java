package features.navigation;

// Source: https://www.youtube.com/watch?v=o-6CcDFn5Ug

import model.Category;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;
import steps.NavigatingUser;

// There are issues with Serenity and JUnit5
// I don't get this dependency solved
// Reference for the solution is here:
// https://github.com/fabianlinz/serenity-junit5
@net.serenitybdd.junit5.SerenityTest
public class WhenBrowsingProductCategories {

    @Steps
    NavigatingUser mark;

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory(){
        //Given
        mark.isOnTheHomePage();

        //When
        mark.navigatesToCategory(Category.Motors);

        //Then
        mark.shouldSeePageTitleContaining("New & used cars");

    }
}
