package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressBook {
	
	@FindBy (xpath = "//h4[text()='Address Book ']")
	private WebElement bookText;
	
	@FindBy (xpath = "(//div[contains(@id,'rdAddCont')])[2]")
	private WebElement newContact;
	
	@FindBy (xpath = "//input[@id='contact_full_name']")
	private WebElement fullName;
	
	@FindBy (xpath = "//input[@id='contact_email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='contact_nickname']")
	private WebElement nickName;
	
	@FindBy (xpath = "//input[@id='contact_company_name']")
	private WebElement company;
	
	@FindBy (xpath = "//input[@id='contact_home_phone']")
	private WebElement homeNumber;
	
	@FindBy (xpath = "//input[@id='contact_business_no']")
	private WebElement businessNumber;
	
	@FindBy (xpath = "//input[@id='contact_mobile_no']")
	private WebElement mobileNumber;
	
	@FindBy (xpath = "//input[@type='checkbox']")
	private WebElement mailingAddressCheckBox;
	
	@FindBy (xpath = "//textarea[@id='contact_street_name']")
	private WebElement street;
	
	@FindBy (xpath = "//input[@id='contact_city_name']")
	private WebElement city;
	
	@FindBy (xpath = "//input[@id='contact_state']")
	private WebElement state;
	
	@FindBy (xpath = "//input[@id='contact_country']")
	private WebElement country;
	
	@FindBy (xpath = "//input[@id='contact_birthday']")
	private WebElement birthday;
	
	@FindBy (xpath = "//select[@data-handler='selectYear']")
	private WebElement birthYear;
	
	@FindBy (xpath = "//select[@data-handler='selectMonth']")
	private WebElement birthMonth;
	
	@FindBy (xpath = "//a[text()='5']")
	private WebElement dOfBirth;
	
	@FindBy (xpath = "//div[@id='save_contact']")
	private WebElement save;
	
	private Select list;
	
	public AddressBook(WebDriver driver6) 
	{
		PageFactory.initElements(driver6, this);
		list = new Select(birthYear);
		list = new Select(birthMonth);
	}
	
	public String getAddressBookText() {
		String txt = bookText.getText();
		return txt;
	}
	
	public void createNewContact() {
		newContact.click();
	}
	
	public void giveFullName(String name) {
		fullName.sendKeys(name);
	}
	
	public void giveEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void yourNickName(String nick) {
		nickName.sendKeys(nick);
	}
	
	public void currentCompany(String firm) {
		company.sendKeys(firm);
	}
	
	public void homePhoneNumber(String home) {
		homeNumber.sendKeys(home);
	}
	
	public void businessPhoneNumber(String business) {
		businessNumber.sendKeys(business);
	}
	
	public void mobilePhoneNumber(String mobile) {
		mobileNumber.sendKeys(mobile);
	}
	
	public boolean mailingAddressCheckBox() {
		boolean result = mailingAddressCheckBox.isSelected();
		mailingAddressCheckBox.click();
		return result;
	}
	
	public void streetName(String road) throws InterruptedException {
		street.click();
		Thread.sleep(1000);
		street.sendKeys(road);
	}
	
	public void cityName(String village) throws InterruptedException {
		city.click();
		Thread.sleep(1000);
		city.sendKeys(village);
	}
	
	public String stateName(String value, String region) throws InterruptedException {
		String txt2 = state.getAttribute(value);
		state.click();
		Thread.sleep(1000);
		state.sendKeys(region);
		return txt2;
	}
	
	public String countryName(String value, String region) throws InterruptedException {
		String txt4 = country.getAttribute(value);
		country.click();
		Thread.sleep(1000);
		country.sendKeys(region);
		return txt4;
	}
	
	public void clickOnBirthday() {
		birthday.click();
	}
	
	public void selectBirthYear(String year) {= new Select(birthMonth);
		list.selectByVisibleText(year);
	}
	
	public void selectBirthMonth(int day) { 
		list.selectByIndex(day);
	}
	
	public void selectDOfBirth() {
		dOfBirth.click();
	}
	public void saveContact() {
		save.click();
	}

}
