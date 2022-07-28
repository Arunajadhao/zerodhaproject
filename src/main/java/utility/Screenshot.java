package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void takeScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot A=(TakesScreenshot)driver;
	File source	=A.getScreenshotAs(OutputType.FILE);
	File destinstion= new File("C:\\Screenshot\\"+name+".png");
	FileHandler.copy(source, destinstion);
	}
}


