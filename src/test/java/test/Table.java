package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pojo.Createdriver;


public class Table  {
	public static void main(String args[])
	{
		WebDriver driver = Createdriver.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> headings = driver.findElements(By.xpath("//table//thead//tr//th"));
		int size = headings.size();
		System.out.println(size);
		for(int i=0; i<size; i++)
		{
		WebElement head = headings.get(i);
		System.out.println(head.getText());
	}

	}}
