package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class Myhooks {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		Properties prop	=ConfigReader.initializeProperties();
		driver=DriverFactory.initializeBrowser(prop.getProperty("browser"));
//		driver=DriverFactory.getDriver();		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@After
	public void teardown(Scenario scenario)
	
	{
		
		String scenarioName=scenario.getName().replaceAll(" ", " ");
		
		if(scenario.isFailed())
		{
			byte[] srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenshot,"image/png", scenarioName);
			
		}
		driver.quit();
		
	}

}
