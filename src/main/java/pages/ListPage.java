package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;

public class ListPage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public ListPage(WebDriver driver)
	{
		
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementUtils=new ElementUtils(driver);
			
	}
	
	

	@FindBy (xpath = "//p[@id='format-label']")
	private WebElement format;
	
	
	 public Boolean  PageValidate()
		
	   { 
		 return elementUtils.displayStatusOfElement(format, 20);
		 //return format.isDisplayed();
		   
	   }

}
