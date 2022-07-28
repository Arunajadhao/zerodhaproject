
package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.ChromeBrowser;
import pom.KiteZerodhaLoginpage;
import utility.Excelparametrization;
import utility.Reports;
@Listeners(Listener.class)
public class ZerodhaLoginTest extends BaseTest  {
	//WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	@BeforeTest
	public void ConfigureReport() {
	extent =Reports.generateReports();
}

	@BeforeMethod
	public void opening()
	{
driver=ChromeBrowser.openBrowser();
}
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		KiteZerodhaLoginpage login = new KiteZerodhaLoginpage(driver);
		//Thread.sleep(2000);
		
		String user=Excelparametrization.excelsheet("sheet1",0,0);
		login.enteruserid(user);
		//Thread.sleep(2000);
		String user1=Excelparametrization.excelsheet("sheet1",1,0);
        
		login.enterpassword(user1);
		login.clickonsubmit();
		//Thread.sleep(1000);
		String user2 = Excelparametrization.excelsheet("sheet1", 2, 0);
		login.enterpin(driver, user2);
		login.clickoncontinue();
		
	}
	@Test
	public void verifySingUpFeature() {
		test = extent.createTest("vefirySignup");
		KiteZerodhaLoginpage login = new KiteZerodhaLoginpage(driver);
		login.ClickOnSignup();
		
	}
	@AfterMethod
	public void PostExecution(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,result.getName());
		}
		else
		{
			test.log(Status.SKIP,result.getName());
			
			}}
		@AfterTest
		public void publishReport() {
			extent.flush();
		
		
	}

		
	}
	

