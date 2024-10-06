package qa.citroen.utilities;


import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class AppUtil{
	

	public static void highlightElement(Page page, String locator){
		page.locator(locator).highlight();
		page.locator(locator).focus();
	}

	public static void clickButton(Page page, String locator) {
		page.locator(locator).click();
	}

	public static boolean isElementVisible(Page page, String locator){
		return page.locator(locator).isVisible();
	}
}