package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath = "(//div[@class='label'])[2]")
	private WebElement tasksPage;

	@FindBy (xpath = "(//div[@class='label'])[3]")
	private WebElement reportsPage;

	@FindBy (xpath = "(//div[@class='label'])[4]")
	private WebElement usersPage;

	@FindBy (xpath = "(//div[@class='label'])[5]")
	private WebElement workSchedulePage;

	@FindBy (xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	
	public ApplicationHeader(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTasksPage() {
		tasksPage.click();
	}
	
	public void clickOnReportsPage() {
		reportsPage.click();
	}
	
	public void clickOnUsersPage() {
		usersPage.click();
	}
	
	public void clickOnWorkSchedulePage() {
		workSchedulePage.click();
	}
	
	public void logoutApplication() {
		logout.click();
	}
	
}
