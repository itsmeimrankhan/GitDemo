package Academy_E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.baseClass;
import junit.framework.Assert;
import pageObjects.LandingPage;


public class ValidateNavigationBar extends baseClass{
	
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(baseClass.class.getName());

	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	@Test
	public void ValidateNavigationBar()
	{ 
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		
		LandingPage lp = new LandingPage(driver);
		
		//compare the text from the browser with actual text, if not it should fail 
		Assert.assertTrue(lp.getNavigationBar().isDisplayed());
		//Assert.assertFalse(false);	
		log.info("Navigate bar is displayed");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
