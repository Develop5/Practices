package qa.zalando.stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import qa.zalando.factory.PlaywrightFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestContext{

	public static final Logger logger = LogManager.getLogger(PlaywrightFactory.class.getName());
	protected static Properties prop;
	protected static Playwright playwright;
   protected static Browser browser;
   protected BrowserContext context;
   protected Page page;
	
	@BeforeAll
	public static void BeforeAll(){
		playwright = Playwright.create();
		String browserName = prop.getProperty("browser").trim();
		//browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
    	.setHeadless(false)
    	.setSlowMo(100));
	}

	public Properties read_properties() {

		try {
			FileInputStream initialProperties = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(initialProperties);
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, unable to find file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Unable to open input file");
			e.printStackTrace();
		}
		logger.info("Properties : " + prop);
		return prop;
	}


	public Browser getBrowser(){
		return browser;
	}

	public Page newPage(){
		context = browser.newContext();
		return context.newPage();
	}

	@AfterAll
	public static void AfterAll(){
		//sleep for 5 seconds for viewing result (headed mode)
		try {
      	Thread.sleep(5000);
	   } catch(InterruptedException ex) {
	   	System.out.println(ex.getMessage());
	   }
	}

}