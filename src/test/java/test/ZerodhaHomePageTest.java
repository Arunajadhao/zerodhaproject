package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.ChromeBrowser;
import pom.KiteZerodhaLoginpage;
import pom.ZerodhaHomePage;
import utility.Excelparametrization;

public class ZerodhaHomePageTest {
	WebDriver driver;
	@BeforeMethod
	public  void StockSearch() throws EncryptedDocumentException, IOException, InterruptedException
	{
	driver = ChromeBrowser.openBrowser();
	KiteZerodhaLoginpage login = new KiteZerodhaLoginpage(driver);
	
	String user=Excelparametrization.excelsheet("sheet1",0,0);
	login.enteruserid(user);
	
	String user1=Excelparametrization.excelsheet("sheet1",1,0);
    
	login.enterpassword(user1);
	login.clickonsubmit();
	//Thread.sleep(2000);
	String user2 = Excelparametrization.excelsheet("sheet1", 2, 0);
	login.enterpin(driver, user2);
	login.clickoncontinue();
}
	@Test
public void searchStock() throws InterruptedException
{
ZerodhaHomePage zerodhaHomePage= new ZerodhaHomePage(driver);
//Thread.sleep(2000);
zerodhaHomePage.searchStock("Tata");
zerodhaHomePage.selectStock(driver,"TATAPOWER");

}
	
	
	
}

