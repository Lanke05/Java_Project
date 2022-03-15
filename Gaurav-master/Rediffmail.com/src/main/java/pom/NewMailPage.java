package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewMailPage {
	
	@FindBy (xpath = "(//input[@type='text'])[8]")
	private WebElement emailRecipient;
	
	@FindBy (xpath = "//a[contains(@class,'cc_bcc')]")
	private WebElement ccBcc;
	
	@FindBy (xpath = "//input[@id='CC_IDcmp2']")
	private WebElement cc;
	
	@FindBy (xpath = "//input[@id='BCC_IDcmp2']")
	private WebElement bcc;
	
	@FindBy (xpath = "(//input[@type='text'])[11]")
	private WebElement subject;
	
	@FindBy (xpath = "//iframe[contains(@title,'Rich Text Editor,')]")
	private WebElement iFrame;
	
	@FindBy (xpath = "//body[@contenteditable='true']")
	private WebElement message;
	
	@FindBy (xpath = "//li[@rd-type='compose']/div/div/div/a[1]")
	private WebElement send;
	
	private WebDriver driver;
	
	public NewMailPage(WebDriver driver5) 
	{
		PageFactory.initElements(driver5, this);
		driver = driver5;
	}
	
	public void enterEmailRecipient(String recipient) {
		emailRecipient.click();
		emailRecipient.sendKeys(recipient);
	}
	
	public boolean enterCcBcc() {
		boolean result = ccBcc.isEnabled();
		ccBcc.click();
		return result;
	}

	public void enterCc(String ccValue) {
		cc.sendKeys(ccValue);
	}

	public void enterBcc(String bccValue) {
		bcc.sendKeys(bccValue);
	}

	public void emailSubject(String sub) {
		subject.sendKeys(sub);
	}
	
	public void switchToIframe() {
		driver.switchTo().frame(iFrame);
	}
	
	public void messageBody(String msg) {
		message.sendKeys(msg);
	}
	
	public void sendMail() {
		send.click();
	}
	
}
