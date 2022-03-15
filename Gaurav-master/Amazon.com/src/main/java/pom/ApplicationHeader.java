package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath = "//span[text()='Hello, Sign in']")
	private WebElement  account;
	
	@FindBy (xpath = "(//span[text()='Sign in'])[1]")
	private WebElement  signIn;
	
	@FindBy (xpath = "//div[@id='nav-cart-count-container']")
	private WebElement  viewCart;
	
	@FindBy (xpath = "//a[text()='Amazon Pay']")
	private WebElement  amazonPay;
	
	@FindBy (xpath = "//a[text()='Gift Cards']")
	private WebElement  giftCards;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement  search;
	
	@FindBy (xpath = "//input[contains(@id,'nav-search')]")
	private WebElement  submit;
	
	private WebDriver driver;
	
	private Actions actions;
	
	public ApplicationHeader(WebDriver driver2) 
	{
		PageFactory.initElements(driver2, this);
		driver = driver2;
		actions = new Actions(driver);
	}
		
	public void accountAndSignIn() throws InterruptedException {
		actions.moveToElement(account).build().perform();
		Thread.sleep(1000);
		actions.moveToElement(signIn).click().build().perform();
	}
	
	public void goToAamazonPay() {
		amazonPay.click();
	}
	
	public void goToGiftCards() {
		giftCards.click();
	}
	
	public void searchProductsTab(String keyword) {
		search.sendKeys(keyword);
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	public void goToCart() {
		viewCart.click();
	}

}
