package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobSavePage {
	
	@FindBy (xpath = "//button[text()='Save']")
	private WebElement saveJobs;

	public JobSavePage(WebDriver driver9)
	{
		PageFactory.initElements(driver9, this);
	}
	
	public void saveTheJobs() {
		saveJobs.click();
	}
	
}
