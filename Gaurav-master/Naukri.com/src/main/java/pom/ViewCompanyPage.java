package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCompanyPage {
	
	@FindBy (xpath = "(//a[text()='View all'])[1]")
	private WebElement lookWorkspace;

	@FindBy (xpath = "(//a[text()='View all'])[5]")
	private WebElement interviewQuestions;
	
	public ViewCompanyPage(WebDriver driver11)
	{
		PageFactory.initElements(driver11, this);
	}
	
	public void viewWorkSpace() {
		lookWorkspace.click();
	}
	
	public void viewInterviewQuestions() {
		interviewQuestions.click();
	}
	
}
