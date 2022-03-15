package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyGiftCard {
	
	private WebDriver driver;
	
	@FindBy (xpath = "//div[@id='gc-design-title-section']")
	private WebElement giftCardText;
	
	@FindBy (xpath = "//img[@id='gc-standard-design-image']")
	private WebElement viewImage;
	
	@FindBy (xpath = "//button[@data-action='a-popover-close']")
	private WebElement close;
	
	@FindBy (xpath = "//button[@id='gc-delivery-mechanism-button-Email-announce']")
	private WebElement deliveryEmail;
	
	@FindBy (xpath = "//textarea[@placeholder='Enter recipient e-mail address']")
	private WebElement recipientEmail;
	
	@FindBy (xpath = "//textarea[@placeholder='Write a message']")
	private WebElement messageText;
	
	@FindBy (xpath = "//input[@id='gc-order-form-date-val']")
	private WebElement deliveryDate;
	
	@FindBy (xpath = "(//a[@data-action='a-cal-select-date'])[28]")
	private WebElement selectDeliveryDate;
	
	@FindBy (xpath = "//input[@id='gc-buy-box-atc']")
	private WebElement addToCart;
	
	public BuyGiftCard(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String getGiftCardDesignText() {
		String text = giftCardText.getText();
		return text;
	}
	
	public void previewGiftCardImage() throws InterruptedException {
		viewImage.click();
		Thread.sleep(3000);
		close.click();
	}
	
	public void selectDeliveryEmail() {
		deliveryEmail.click();
	}

	public void enterRecipientEmail(String email) {
		recipientEmail.sendKeys(email);
	}

	public String getMessageText() {
		String text2 = messageText.getText();
		return text2;
	}

	public void deliveryDate() {
		deliveryDate.click();
		selectDeliveryDate.click();
	}

	public void addGiftCardToCart() {
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("arguments[0].scrollIntoView(true);", addToCart);
		addToCart.click();
	}	

}
