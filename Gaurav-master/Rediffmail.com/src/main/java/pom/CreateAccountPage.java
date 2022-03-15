package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {
	
	@FindBy	(xpath = "//td[text()='Create a Rediffmail account']")
	private WebElement create;

	@FindBy (xpath = "//table[@width='660']/tbody/tr[3]/td[3]/input")
	private WebElement fullName;

	@FindBy (xpath = "//table[@height='54']//tr[7]/td[3]/input[1]")
	private WebElement chooseId;

	@FindBy (xpath = "(//input[@type='button'])[1]")
	private WebElement check;

	@FindBy (xpath = "//table[@width='660']//tr[9]//input")
	private WebElement password;

	@FindBy (xpath = "//table[@width='660']//tr[11]/td[3]/input")
	private WebElement reTypePassword;

	@FindBy (xpath = "(//table[@border='0'])[4]//input")
	private WebElement alternateEmailId;

	@FindBy (xpath = "(//td[@colspan='3'])[5]//select")
	private WebElement securityQuestion;

	@FindBy (xpath = "(//td[@width='185'])[3]//input")
	private WebElement answer;

	@FindBy (xpath = "(//table[@class='f14'])[3]/tbody//tr[6]//input")
	private WebElement motherMaidenName;

	@FindBy (xpath = "(//div[@id='div_mob']//input)[2]")
	private WebElement mobileNo;

	@FindBy (xpath = "(//td[@colspan='3'])[8]//select[1]")
	private WebElement dateOfBirth;

	@FindBy (xpath = "(//td[@colspan='3'])[8]//select[2]")
	private WebElement dateOfMonth;

	@FindBy (xpath = "(//td[@colspan='3'])[8]//select[3]")
	private WebElement dateOfYear;

	@FindBy (xpath = "((//td[@colspan='3'])[9]//input)[1]")
	private WebElement gender;

	@FindBy (xpath = "(//td[@colspan='3'])[10]//select")
	private WebElement country;

	@FindBy (xpath = "((//td[@colspan='3'])[14]//input)[6]")
	private WebElement createMyAccount;
	
	public CreateAccountPage (WebDriver driver3) 
	{
		PageFactory.initElements(driver3, this);
	}
	
	public String getCreateAccountText() {
		String text01 = create.getText();
		return text01;
	}
	
	public void enterFullName (String name) {
		fullName.sendKeys(name);
	}

	public void chooseRediffId (String id) {
		chooseId.sendKeys(id);
	}
	
	public String getCheckAvailabilityText () {
		String text02 = check.getText();
		check.click();
		return text02;
	}

	public void enterPassword (String pass) throws InterruptedException {
		password.sendKeys(pass);
		Thread.sleep(2000);
		reTypePassword.sendKeys(pass);
	}
	
	public boolean dontHaveAlternateEmalid() {
		boolean result = alternateEmailId.isSelected();
		alternateEmailId.click();
		return result;
	}

	public void selectSecurityQuestion(String question) {
		Select select = new Select (securityQuestion);
		select.selectByVisibleText(question);
	}
	
	public void answer (String school) {
		answer.sendKeys(school);
	}

	public void enterMotherMaidenName(String maiden) {
		motherMaidenName.sendKeys(maiden);
	}
	
	public void mobileNo (String no) {
		mobileNo.sendKeys(no);
	}

	public void  dateOfBirth( int day ,String month ,String year) throws InterruptedException  {
		Select select = new Select(dateOfBirth);
		select.selectByIndex(day);
		Thread.sleep(1000);
		Select select1 = new Select (dateOfMonth);
		select1.selectByValue(month);
		Thread.sleep(1000);
		Select select11 = new Select (dateOfYear);
		select11.selectByVisibleText(year);
	}
	
	public boolean gender () {
		boolean result1 = gender.isSelected();
		gender.click();
		return result1;
	}

	public void selectCountry(String region) {
		Select select = new Select (country);
		select.selectByValue(region);
	}
	
	public void createMyAccount() {
		createMyAccount.click();
	}

}
