package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Createdriver;

public class Table1 {
	public static void main(String args[])
	{
		WebDriver driver = Createdriver.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int size = currentprice.size();
		double maxprice =0;
		int index=0;
		for(int i=0; i<size ; i++)
		{
			WebElement price = currentprice.get(i);
			String value = price.getText();
			double amount = Double.parseDouble(value);
			if(amount>maxprice)
			{
				maxprice = amount;
				index=i;
			}
			/*System.out.println("max price is"+maxprice);
			List<WebElement> name = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
			WebElement Stockname = name.get(index);
			System.out.println(Stockname.getText());*/
		}
		
	}

}
