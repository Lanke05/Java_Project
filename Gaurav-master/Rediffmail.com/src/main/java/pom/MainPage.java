package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	@FindBy (xpath = "//a[text()='Sign in']")
	private WebElement signIn;
	
	@FindBy (xpath = "//a[@title='Create Rediffmail Account']")
	private WebElement createAccount;
	
	public MainPage (WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	public void accountSignIn() {
		signIn.click();
	}
	
	public void createRediffAccount() {
		createAccount.click();
	}

}
