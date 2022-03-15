package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsAddToCartPage {
	
	@FindBy (xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCart;
	
	public ProductsAddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addProductToCart() {
		addToCart.click();
	}
	
}
