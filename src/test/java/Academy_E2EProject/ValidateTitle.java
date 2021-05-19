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


public class ValidateTitle extends baseClass{
	
	public WebDriver driver;
	
	public static Logger log =LogManager.getLogger(baseClass.class.getName());
	
	LandingPage lp;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		log.info("Navigate to Home Page");
	}
	
	
	@Test
	public void ValidateTitle() throws IOException
	{ 
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		
		lp = new LandingPage(driver);
		
		//compare the text from the browser with actual text, if not it should fail 
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		//lp.getTitle().getText();
		
		log.info("Successfully validated Text message");
		System.out.println("Test Completed");
	}
	
	
	@Test
	public void ValidateHeader() throws IOException
	{ 
		
		//lp = new LandingPage(driver);  //globally declared and skip to access it
		
		//compare the text from the browser with actual text, if not it should fail 
		
		Assert.assertEquals(lp.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
				
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver = null;
	}
}
