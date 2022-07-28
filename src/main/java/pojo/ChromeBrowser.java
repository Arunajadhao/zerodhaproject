package pojo;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowser {
	public static WebDriver openBrowser()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

	
	System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	driver.navigate().to("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
	return driver;

}
}

