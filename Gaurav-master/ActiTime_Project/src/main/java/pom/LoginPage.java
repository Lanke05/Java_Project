package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement userName;

	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement password;

	@FindBy (xpath = "//input[@name='remember']")
	private WebElement rememberBox;

	@FindBy (xpath = "//div[text()='Login ']")
	private WebElement loginToApplication;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String user) {
		userName.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnKeepMeLogin() {
		rememberBox.click();
	}
	
	public void clickOnLogin() {
		loginToApplication.click();
	}
	
}
