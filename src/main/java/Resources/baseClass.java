package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseClass {
	
	public WebDriver driver;
	public Properties prop;
	//public String url;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		
		//System.getProperty("user.dir")
		FileInputStream fis = new FileInputStream("G:\\Eclipse-version\\Work history\\Testing_E2E\\src\\main\\java\\Resources\\data.properties");
		
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);
		
    //mvn test -Dbrowser = chrome
		 
	 //To send parameters through maven commands instead of writing text
		String browserName=System.getProperty("browser"); 
		
	//hardcoded of writing text
	    //String browserName = prop.getProperty("browser");
		
		System.out.println(browserName);
		
		//if(browserName.equals("chrome")) 
		if(browserName.contains("chrome"))
		{
			// execute in chrome driver
			System.setProperty("webdriver.chrome.driver", "G:\\WebDrivers\\chromedriver.exe");
			
	 //headless mode
			ChromeOptions options = new ChromeOptions();
			if(browserName.contains("headless"))
			{
					options.addArguments("headless");
			}	
			
			driver = new ChromeDriver(options);
			
	 //remove hardcoded paths
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\chromedriver.exe");
			

		} 
		else if (browserName.equals("firefox")) 
		{
		// execute firefox browser
			System.setProperty("webdriver.gecko.driver", "G:\\WebDrivers\\geckodriver.exe");
			
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} 
		else if (browserName.equals("IE")) 
		{
		// execute IE browser
			System.setProperty("webdriver.ie.driver","G:\\WebDrivers\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
			
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Resources\\IEDriverServer.exe");

			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(src,new File(destinationFile));
		
		return destinationFile;
	}
}


