package TASK_DWS_ELEMENT_REPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TASK_DWS_GENERIC_LIBRARY.BasePage;

public class ShoppingCartPage_Book_Buy extends BasePage{
	public ShoppingCartPage_Book_Buy(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText  = "Computing and Internet")
	private WebElement prdt1;

	@FindBy(xpath = "(//input[@value=\"Add to cart\"])[1]")
	private WebElement addtocart_button;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingcart_button;
	
	@FindBy(id = "CountryId")
	private WebElement country_id_dropdown;

	@FindBy(id = "termsofservice")
	private WebElement terms_checkbox;
	
	@FindBy(id = "checkout")
	private WebElement checkoutbox;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement country_dropdown;
	
	@FindBy(id = "Canada")
	private WebElement canada_button;
	
	public WebElement getPrdt1() {
		return prdt1;
	}

	public WebElement getAddtocart_button() {
		return addtocart_button;
	}

	public WebElement getShoppingcart_button() {
		return shoppingcart_button;
	}
	
}
