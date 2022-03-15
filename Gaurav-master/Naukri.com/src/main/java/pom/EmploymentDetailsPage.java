package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmploymentDetailsPage {
	
	@FindBy (xpath = "//input[@placeholder='Type Your Designation']")
	private WebElement designation;

	@FindBy (xpath = "//input[@placeholder='Type Your Organization']")
	private WebElement organization;

	@FindBy (xpath = "//input[@id='startedYearFor']")
	private WebElement workingYear;
	
	@FindBy (xpath = "//a[@data-id='startedYear_2018']")
	private WebElement selectWorkingYear;

	@FindBy (xpath = "//input[@id='startedMonthFor']")
	private WebElement workingMonth;
	
	@FindBy (xpath = "//a[@data-id='startedMonth_8']")
	private WebElement selectWorkingMonth;

	@FindBy (xpath = "//div[@class='present-box']")
	private WebElement workedTill;
	
	@FindBy (xpath = "//span[text()='Current Salary']")
	private WebElement currentSalary;
	
	@FindBy (xpath = "//input[@id='currentLakhDroopeFor']")
	private WebElement salaryInLakh;
	
	@FindBy (xpath = "//a[@data-id='currentLakhDroope_5']")
	private WebElement selectLakhSalary;
	
	@FindBy (xpath = "//input[@id='currentThouDroopeFor']")
	private WebElement salaryInThaosand;
	
	@FindBy (xpath = "//a[@data-id='currentThouDroope_0']")
	private WebElement selectThousandSalary;
	
	@FindBy (xpath = "//input[@id='keySkillSugg']")
	private WebElement skills;
	
	@FindBy (xpath = "//textarea[@id='jobDescription']")
	private WebElement jobDescription;
	
	@FindBy (xpath = "//input[@id='noticePeriodFor']")
	private WebElement noticePeriod;
	
	@FindBy (xpath = "//a[@data-id='noticePeriod_1']")
	private WebElement selectNoticePeriod;
	
	@FindBy (xpath = "//button[@id='submitEmployment']")
	private WebElement save;
	
	public EmploymentDetailsPage(WebDriver driver8)
	{
		PageFactory.initElements(driver8, this);
	}
	
	public void yourDesignation(String desg) {
		designation.sendKeys(desg);
	}
	
	public void yourOrganization(String org ) {
		organization.sendKeys(org);
	}
	
	public void startedWorkingFrom() {
		workingYear.click();
		selectWorkingYear.click();
		workingMonth.click();
		selectWorkingMonth.click();
	}

	public String getCurrentSalaryText() {
		String text =  workedTill.getText();
		return text;
	}
	
	public String getcurrentSalaryAttributeValue(String value) {
		String attb = currentSalary.getAttribute(value);
		return attb;
	}
	
	public void enterCurrentSalary() {
		salaryInLakh.click();
		selectLakhSalary.click();
		salaryInThaosand.click();
		selectThousandSalary.click();
	}
	
	public void enterKeySkills(String skill) {
		skills.sendKeys(skill);
	}
	
	public void enterJobDescription(String jd) {
		jobDescription.sendKeys(jd);
	}

	public void enterNoticePeriod() {
		noticePeriod.click();
		selectNoticePeriod.click();
	}
	
	public void saveEmploymentDetails() {
		save.click();
	}
}

