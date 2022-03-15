package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchResult {
	
	private WebDriver driver;
	
	private JavascriptExecutor java;
	
	@FindBy (xpath = "(//img[@class='s-image'])[1]")
	private WebElement product01;
	
	@FindBy (xpath = "(//img[@class='s-image'])[4]")
	private WebElement product02;
	
	@FindBy (xpath = "(//img[@class='s-image'])[5]")
	private WebElement product03;
	
	public ProductSearchResult(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnProduct01() {
		java = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].scrollIntoView(true);", product01);
		product01.click();
	}
	
	public void clickOnProduct02() {
		java = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].scrollIntoView(true);", product02);
		product02.click();		
	}
	
	public void clickOnProduct03() {
		java = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].scrollIntoView(true);", product03);
		product03.click();
	}

}
