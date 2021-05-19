package Academy_E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.baseClass;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;


public class HomePage extends baseClass{
	
	public static Logger log =LogManager.getLogger(baseClass.class.getName());

	
	public WebDriver driver;

	LandingPage lp;
	LoginPage lg;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
		//driver.get(prop.getProperty("url"));
		lp= new LandingPage(driver);
		lg = new LoginPage(driver);
	}
	
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String username, String password, String text) throws IOException
	{ 
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		
		driver.get(prop.getProperty("url"));
		//LandingPage lp = new LandingPage(driver);
		LoginPage lg = lp.getLogin();
		
		//LoginPage log = new LoginPage(driver);
		lg.getEmail().sendKeys(username);
		lg.getPassword().sendKeys(password);
		//System.out.println(text);
		
		log.info(text);
		
		lg.getLogin().click();
		
		//forgot password
		ForgotPassword fp = lg.forgotPassword();
		fp.getEmail().sendKeys("imrankhan004");
		fp.getInstruction().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	@DataProvider
	
	public Object[][] getData()
	{
		//Row stands for how many different data types test should run
		//column stands for how many values per each test
		
		
		Object[][] data  = new Object[3][3]; /*Object[2][2]-->[2] how many times you need to run
		define that many rows,  [2] -> each running how many values you are passing that many columns you define that*/
		
		//0th row
		data[0][0] = "imrankhan123@test.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted user";
		
		//1th row
		data[1][0] = "Pathan456@test.com";
		data[1][1] = "7891011";
		data[1][2] = "Non Restricted user";
		
		//2d row
		data[2][0] = "Aman@test.com";
		data[2][1] = "9558801";
		data[2][2] = "Authetication error";
		
		return data;
	}

}
