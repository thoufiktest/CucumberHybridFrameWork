package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.CommonUtils;

public class DriverFactory {
	
	static WebDriver driver=null;
	
	
	public static WebDriver initializeBrowser(String browserName)
	{
		
		if (browserName.equals("chrome")) 
		
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Beqisoft\\Documents\\java\\projects\\CSFE_AUTOMATION\\src\\test\\resources\\Drivers\\chromedriver.exe");   
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver= new ChromeDriver(options);
			
		}
		
		
		else if (browserName.equals("firefox")) 
		
		{
			driver=new FirefoxDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
		return driver;
	}
	
	
//	public static WebDriver getDriver()
//	{
//		
//		return driver;
//	}

}
