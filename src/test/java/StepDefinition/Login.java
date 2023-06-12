package StepDefinition;

import io.cucumber.java.en.*;
import pages.ListPage;
import pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import factory.DriverFactory;

import java.awt.peer.LabelPeer;
import java.lang.Thread;  





public class Login {
	
	WebDriver driver;
    private LoginPage loginPage;
    private ListPage listPage;
	@Given("I open the url {string}")
	public void i_open_the_url(String Url) {
		driver=DriverFactory.initializeBrowser(Url);
		//driver=DriverFactory.getDriver();
		driver.get(Url);
	   
	}

	@When("I enter as {string} in the field Company email")
	public void i_enter_as_in_the_field_company_email(String Email) {
    
		 loginPage=new LoginPage(driver);
		 loginPage.enterEmail(Email);
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Email);

	}

	@And("I click on button {string}")
	public void i_click_on_button(String string) {
      
		loginPage.ClickonNext();
		 //driver.findElement(By.xpath("//button[@id='login-next']")).click();
		 

	}

	@And("I enter {string} in the field  Password")
	public void i_enter_in_the_field_password(String Passwd) {
		loginPage.enterPasswd(Passwd);
		//driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(Passwd);

	}

	@And("I click on the button {string}")
	public void i_click_on_the_button(String string) {
		loginPage.ClickonSubmit();
		//driver.findElement(By.xpath("//button[@id='login-submit']")).click();
		
	}

	@Then("I succesfully login to the application")
	public void i_succesfully_login_to_the_application() throws 
	 InterruptedException 
	{
	 listPage=new ListPage(driver);
       Thread.sleep(3000);
       Assert.assertTrue(listPage.PageValidate());
       
     //	  Assert.assertTrue(driver.findElement(By.xpath("//p[@id='format-label']")).isDisplayed());
	}
	
	

}
