package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	public static ExtentReports generateReports() {
		ExtentSparkReporter htmlReports = new ExtentSparkReporter("extentReport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReports);
		extent.setSystemInfo("test", "Zerodha");
		extent.setSystemInfo("Tester", "Aruna");
		return extent;
		
	}

}
