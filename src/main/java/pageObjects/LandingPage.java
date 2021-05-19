package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector("div[class='text-center'] h2");
	By navBar = By.cssSelector("li[class='active'] a");
	private By header = By.cssSelector("div[class*='video-banner'] h3");
	
	//By popup=By.xpath("//button[text()='NO THANKS']");

	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	
	
	
	public LoginPage getLogin() 
	{
		//return driver.findElement(signin);
		
		driver.findElement(signin).click();
		LoginPage lg= new LoginPage(driver);
		return lg;

	}
	
	public WebElement getTitle() 
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar() 
	{
		return driver.findElement(navBar);
	}
	
	public WebElement getHeader() 
	{
		return driver.findElement(header);
	}
	
}
