package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrainTicketDetails {
	
	@FindBy (xpath = "(//div[@class='a2eebcc2'])[1]")
	private WebElement travellers01;
	
	@FindBy (xpath = "(//div[@class='a2eebcc2'])[2]")
	private WebElement travellers02;
	
	@FindBy (xpath = "(//div[@class='a2eebcc2'])[4]")
	private WebElement travellers03;
	
	@FindBy (xpath = "//a[text()='Additional Preferences (optional)']")
	private WebElement preferences;
	
	@FindBy (xpath = "//span[contains(text(),'Book only if all')]")
	private WebElement bookPreferences;
	
	@FindBy (xpath = "//button[text()='Apply']")
	private WebElement applyPref;
	
	@FindBy (xpath = "//input[@name='pincode']")
	private WebElement destPincode;
	
	@FindBy (xpath = "//input[@name='address']")
	private WebElement destAddress;
	
	@FindBy (xpath = "//span[@class='_2f9c0851']")
	private WebElement travelInsurance;
	
	@FindBy (xpath = "//button[text()='Proceed to review']")
	private WebElement proceedToReview;
	
	@FindBy (xpath = "//span[@class='a674b0ec dcb9db95']")
	private WebElement termsCheckBox;
	
	@FindBy (xpath = "//button[text()='I remember my password']")
	private WebElement irctcUser;
	
	public TrainTicketDetails(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectTravellers() {
		travellers01.click();
		travellers02.click();
		travellers03.click();
	}
	
	public void additonalPreferences() throws InterruptedException {
		preferences.click();
		Thread.sleep(1000);
		bookPreferences.click();
		Thread.sleep(1000);
		applyPref.click();
	}
	
	public void destinationAddress(String pin, String addr) throws InterruptedException {
		destPincode.sendKeys(pin);
		Thread.sleep(2000);
		destAddress.sendKeys(addr);
	}
	
	public void availTravelInsurance() {
		travelInsurance.click();
	}
	
	public boolean checkProceedToReviewButton() {
		boolean result = proceedToReview.isEnabled();
		return result;
	}
	
	public void termsAndConditionsBox() {
		termsCheckBox.click();
	}
	
	public void clickProceedToReviewButton() {
		proceedToReview.click();
	}
	
	public void irctcPassword() {
		irctcUser.click();
	}
	
}
