package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinalReviewBooking {
	
	@FindBy (xpath = "(//div[@class='_86e10ab5'])[2]")
	private WebElement totalAmount;
	
	@FindBy (xpath = "//button[text()='Proceed to payment']")
	private WebElement payment;
	
	public FinalReviewBooking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTotalAmount() {
		String text2 = totalAmount.getText();
		return text2;
	}
	
	public void proceedToPayment() {
		payment.click();
	}
	
}
