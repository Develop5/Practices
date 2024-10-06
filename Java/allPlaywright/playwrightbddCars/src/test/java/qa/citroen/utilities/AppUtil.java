package qa.citroen.utilities;


import com.microsoft.playwright.Page;

public class AppUtil{
	

	public static void highlightElement(Page page, String locator){
		page.locator(locator).highlight();
		page.locator(locator).focus();
	}




}