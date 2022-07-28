package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class KiteZerodhaLoginpage {
		@FindBy (xpath="//input[@type='text']")private WebElement userid;
		@FindBy (xpath="//input[@type='password']")private WebElement password;
		@FindBy (xpath="//button[@type='submit']")private WebElement submit;
		@FindBy (xpath ="//a[text()='Forgot user ID or password?']")private WebElement forgot;
		@FindBy(xpath="//a[@class='text-light']")private WebElement signup;
		@FindBy(xpath="//input[@type='password']")private WebElement pin;
		@FindBy(xpath="//button[@type='submit']")private WebElement open;
		@FindBy(xpath="//input[@type='text']")private WebElement search;
		public KiteZerodhaLoginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		public void enteruserid(String user)
		{
			userid.sendKeys(user);
		}
		public void enterpassword(String pass)
		{
		password.sendKeys(pass);
		}
		public void clickonsubmit()
		{
			submit.click();
		}
		public void clickonforgot()
		{
			forgot.click();
			
		}
		public void enterpin(WebDriver driver,String pin1)
		{
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(30000));
			wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pin1);
		//String Expected =driver.getTitle();
		//Assert assert = new Assert();
		//Assert.assertEquals(Expected,actual);
		
		
		}
		public void clickoncontinue()
		{
			open.click();
		}
		public void searchStocks(String stock)
		{
			search.sendKeys(stock);
			
		}
		public void ClickOnForgot() {
			forgot.click();
		}
		public void ClickOnSignup() {
			signup.click();
		}
		}


