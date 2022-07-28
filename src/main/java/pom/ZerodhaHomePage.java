package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	@FindBy(xpath="//input[@icon='search']")private WebElement searchTab;
	@FindBy(xpath="//span[@class='tradingsymbol']")private List<WebElement> stock;
	//@FindBy(xpath="//button[@data-balloon='Buy']")private WebElement Buy;
	@FindBy(xpath="//button[@data-balloon='Sell']")private WebElement sell;

	public  ZerodhaHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void searchStock(String StockName)
	{
		searchTab.sendKeys(StockName);
	}
	public void selectStock(WebDriver driver,String NameOfStock)
	{
		for(int i=0; i<stock.size(); i++) {
			WebElement currentStock=stock.get(i);
			String name = currentStock.getText();
			if(name.equals(NameOfStock))
			{
				Actions actions = new Actions(driver);
				actions.moveToElement(currentStock);
				actions.perform();
				//Buy.click();
				sell.click();
			}
			
		}}}


