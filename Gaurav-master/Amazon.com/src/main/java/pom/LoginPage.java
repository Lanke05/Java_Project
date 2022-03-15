package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@type='email']")
	private WebElement  email;
	
	@FindBy (xpath = "//input[contains(@id,'continue')]")
	private WebElement  next;
	
	@FindBy (xpath = "//input[@maxlength='1024']")
	private WebElement  password;
	
	@FindBy (xpath = "//input[@tabindex='5']")
	private WebElement  signInButton;
	
	public LoginPage(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
		next.click();
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void signInToAccount() {
		signInButton.click();
	}

}
