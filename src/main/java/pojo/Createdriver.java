package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createdriver 
{
	public static WebDriver openBrowser(String url)
	{
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to(url);
	driver.manage().window().maximize();
	return driver;

}
}