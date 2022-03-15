package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainEmailPage {
	
	@FindBy (xpath = "//b[text()='Write mail']")
	private WebElement newMail;
	
	@FindBy (xpath = "//h4[@title='Address Book']")
	private WebElement addressBook;
	
	@FindBy (xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	@FindBy (xpath = "(//span[@class='rd_from'])[1]")
	private WebElement firstEmail;
	
	@FindBy (xpath = "(//span[@class='rd_from'])[2]")
	private WebElement secondEmail;
	
	@FindBy (xpath = "(//span[@class='rd_from'])[3]")
	private WebElement thirdEmail;
	
	@FindBy (xpath = "(//span[@class='rd_from'])[4]")
	private WebElement fourthEmail;
	
	@FindBy (xpath = "(//span[@class='rd_from'])[5]")
	private WebElement fifthEmail;
	
	@FindBy (xpath = "(//a[text()='Back'])[1]")
	private WebElement backButton;
	
	@FindBy (xpath = "(//cite[@title='Select mail'])[1]")
	private WebElement selectFirstMail;
	
	@FindBy (xpath = "(//cite[@title='Select mail'])[2]")
	private WebElement selectSecondMail;
	
	@FindBy (xpath = "(//cite[@title='Select mail'])[3]")
	private WebElement selectThirdMail;
	
	@FindBy (xpath = "(//cite[@title='Select mail'])[4]")
	private WebElement selectFourthMail;
	
	@FindBy (xpath = "(//cite[@title='Select mail'])[5]")
	private WebElement selectFifthMail;
	
	@FindBy (xpath = "//span[text()='Delete']")
	private WebElement deleteMails;
	
	@FindBy (xpath = "//button[text()='Ok']")
	private WebElement deleteOkButton;
	
	public MainEmailPage (WebDriver driver4) 
	{
		PageFactory.initElements(driver4, this);
	}
	
	public void writeNewMail() {
		newMail.click();
	}
	
	public void clickAddressBook() {
		addressBook.click();
	}
	
	public void logoutAccount() {
		logout.click();
	}
		
	public void clickOn1stEmail() {
		firstEmail.click();
	}
	
	public void clickOn2ndEmail() {
		secondEmail.click();
	}
	
	public void clickOn3rdEmail() {
		thirdEmail.click();
	}
	
	public void clickOn4thEmail() {
		fourthEmail.click();
	}
	
	public void clickOn5thEmail() {
		fifthEmail.click();
	}
	
	public void backToEmailPage() {
		backButton.click();
	}
	
	public boolean verify() {
		boolean result = selectFirstMail.isSelected();
		return result;
	}
		
	public boolean selectMail() {
		boolean result2 = selectSecondMail.isSelected();
		selectFirstMail.click();
		selectSecondMail.click();
		selectThirdMail.click();
		selectFourthMail.click();
		selectFifthMail.click();
		return result2;
	}
	
	public void deleteSelectedMails() throws InterruptedException {
		deleteMails.click();
		Thread.sleep(3000);
		deleteOkButton.click();
	}
	
	
}
