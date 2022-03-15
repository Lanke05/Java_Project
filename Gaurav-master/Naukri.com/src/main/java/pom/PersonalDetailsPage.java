package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {
	
	@FindBy (xpath = "//input[@placeholder='Date']")
	private WebElement birthDate;
	
	@FindBy (xpath = "//a[@data-id='pd-date_5']")
	private WebElement selectDate;
	
	@FindBy (xpath = "//input[@placeholder='Month']")
	private WebElement birthMonth;
	
	@FindBy (xpath = "//a[@data-id='pd-month_2']")
	private WebElement selectMonth;
	
	@FindBy (xpath = "//input[@placeholder='Year']")
	private WebElement birthYear;
	
	@FindBy (xpath = "//a[@data-id='pd-year_1993']")
	private WebElement selectYear;
	
	@FindBy (xpath = "//label[text()='Male']")
	private WebElement gender;
	
	@FindBy (xpath = "//input[@id='pd-permanent-address']")
	private WebElement address;
	
	@FindBy (xpath = "//input[@id='pd-hometown']")
	private WebElement hometown;
	
	@FindBy (xpath = "//input[@id='pd-pincode']")
	private WebElement pincode;
	
	@FindBy (xpath = "//input[@id='pd-maritalStatusFor']")
	private WebElement marritalStatus;
	
	@FindBy (xpath = "//a[@data-id='pd-maritalStatus_M']")
	private WebElement selectMarritalStatus;
	
	@FindBy (xpath = "//input[@id='pd-categoryFor']")
	private WebElement category;
	
	@FindBy (xpath = "//a[@data-id='pd-category_1']")
	private WebElement selectCategory;
	
	@FindBy (xpath = "//label[text()='No']")
	private WebElement physicallyEnabled;
	
	@FindBy (xpath = "//a[@id='add-new-language']")
	private WebElement addLangauge;
	
	@FindBy (xpath = "//input[@id='pd-language-0']")
	private WebElement english;
	
	@FindBy (xpath = "//input[@id='pd-proficiency-0For']")
	private WebElement proficiency;
	
	@FindBy (xpath = "//a[@data-id='pd-proficiency-0_1']")
	private WebElement selectProficiency;
	
	@FindBy (xpath = "//label[@for='pd-ability-read-0']")
	private WebElement readability;
	
	@FindBy (xpath = "//label[@for='pd-ability-write-0']")
	private WebElement writability;
	
	@FindBy (xpath = "//label[@for='pd-ability-speak-0']")
	private WebElement speakability;
	
	@FindBy (xpath = "//button[text()='SAVE']")
	private WebElement save;
	
	public PersonalDetailsPage(WebDriver driver4)
	{
		PageFactory.initElements(driver4, this);
	}

	public void enterBirthDate() {
		birthDate.click();
		selectDate.click();
	}
	
	public void enterBirthMonth() {
		birthMonth.click();
		selectMonth.click();
	}
	
	public void enterBirthYear() {
		birthYear.click();
		selectYear.click();
	}
	
	public boolean verifyGenderSelection() {
		boolean result = gender.isSelected();
		return result;
	}
	
	public void clickOnMaleGender () {
		gender.click();
	}
	
	public void enterPermanentAddress(String addr) {
		address.sendKeys(addr);
	}
	
	public void enterTown(String town) {
		hometown.sendKeys(town);
	}
	
	public void enterPincode(String pin) {
		pincode.sendKeys(pin);
	}
	
	public void enterMarritalStatus() {
		marritalStatus.click();
		selectMarritalStatus.click();
	}
	
	public void enterCategory() {
		category.click();
		selectCategory.click();
	}
	
	public boolean isPhysicallyEnabled() {
		boolean result2 = physicallyEnabled.isSelected();
		return result2;
	}
	
	public void clickPhysicallyEnabled() {
		physicallyEnabled.click();
	}
	
	public void addOneLangauge(String langauge) {
		addLangauge.click();
		english.sendKeys(langauge);
	}
	
	public void enterProficiency() {
		proficiency.click();
		selectProficiency.click();
	}
	
	public void langaugeAbility() {
		readability.click();
		writability.click();
		speakability.click();
	}
	
	public void savePersonalDetails() {
		save.click();
	}
}			