package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardStore {
	
	@FindBy (xpath = "//img[@alt='GC 3']")
	private WebElement selectGiftCard;
	
	public GiftCardStore(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void chooseGiftCard() {
		selectGiftCard.click();
	}

}