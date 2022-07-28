package test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class Listener extends BaseTest implements ITestListener  {
	public void onTestStart(ITestResult result)
	{
		System.out.println("test has started"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("testPassed"+result.getName());
		
		
	}
	public void onTestFail(ITestResult result) {
		//System.out.println("testfail"+result.getName());
		try {
			Screenshot.takeScreenshot(driver, result.getName());
		}catch(IOException e) {
		
			e.printStackTrace();}
	}
public void onTestSkip(ITestResult result)
{
	System.out.println("testSkip"+result.getName());
}
}
