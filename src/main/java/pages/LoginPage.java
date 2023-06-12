package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ElementUtils;


public class LoginPage {
	
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	
	public LoginPage(WebDriver driver)
	{
		
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		elementUtils=new ElementUtils(driver);
			
	}
	
	@FindBy (xpath = "//input[@id='login-username']")
	private WebElement EmailField;  
	
	@FindBy (xpath = "//button[@id='login-next']")
	private WebElement Next;
	
	@FindBy (xpath="//input[@id='login-password']")
	private WebElement passwd;
	
	@FindBy (xpath = "//button[@id='login-submit']")
	private WebElement submit;

	
	
	public void enterEmail(String Email)
	{
		elementUtils.typeTextIntoElement(EmailField, Email, 20);
	//EmailField.sendKeys(Email);
		
	}
	
	public void ClickonNext()
	{
		elementUtils.clickOnElement(Next, 20);
		//Next.click();
	}

	public void enterPasswd(String Passwd)
	
	{
		elementUtils.typeTextIntoElement(passwd, Passwd, 20);
		//passwd.sendKeys(Passwd);
	}

   public void ClickonSubmit()
   {
	   elementUtils.clickOnElement(submit, 20);
	   
	   //submit.click();
   }
   
  


}
