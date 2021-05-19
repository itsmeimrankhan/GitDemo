package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ForgotPassword {

	public WebDriver driver;
	
	By email = By.xpath("//input[@id='user_email']");

	By SendMeInstruction = By.cssSelector("input[name='commit']");
	
		
		
		
		
		public ForgotPassword(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
			this.driver=driver;
		}
		
		
		
		
		public WebElement getEmail()
		{
			return driver.findElement(email);
		}

		public WebElement getInstruction()
		{
			return driver.findElement(SendMeInstruction);
		}
}
