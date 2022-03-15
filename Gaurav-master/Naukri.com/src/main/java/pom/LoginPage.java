package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//div[text()='Login']")
	private WebElement clickLogin;
	
	@FindBy (xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	private WebElement emailId;
	
	@FindBy (xpath = "//input[@placeholder='Enter your password']")
	private WebElement password;
	
	@FindBy (xpath = "//button[text()='Login']")
	private WebElement login;
	
	public LoginPage(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void clickOnLogin() {
		clickLogin.click();
	}
	
	public void enterEmailId(String mailId) {
		emailId.sendKeys(mailId);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void Login() {
		login.click();
	}
	
}
