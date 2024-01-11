package TASK_DWS_ELEMENT_REPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TASK_DWS_GENERIC_LIBRARY.BasePage;

public class ShoppingCartPage_Apparel_shoes extends BasePage{
	public WebElement getPrdt1() {
		return prdt1;
	}

	public WebElement getWishlist_button() {
		return wishlist_button;
	}

	public ShoppingCartPage_Apparel_shoes(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText  = "Blue and green Sneaker")
	private WebElement prdt1;

	@FindBy(id = "add-to-wishlist-button-28")
	private WebElement wishlist_button;
	
		
}
