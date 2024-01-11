package TASK_DWS_ELEMENT_REPO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import TASK_DWS_GENERIC_LIBRARY.BasePage;

public class RegistrationPage extends BasePage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "gender-female")
	private WebElement gender_radio_button;

	@FindBy(id = "FirstName")
	private WebElement firstName_box;

	@FindBy(id = "LastName")
	private WebElement lastName_box;

	public WebElement getGender_radio_button() {
		return gender_radio_button;
	}

	public WebElement getFirstName_box() {
		return firstName_box;
	}

	public WebElement getLastName_box() {
		return lastName_box;
	}

	public WebElement getEmail_box() {
		return email_box;
	}

	public WebElement getPassword_box() {
		return password_box;
	}

	public WebElement getConfirmPassword_box() {
		return confirmPassword_box;
	}

	public WebElement getRegister_button_box() {
		return register_button_box;
	}

	@FindBy(id = "Email")
	private WebElement email_box;

	@FindBy(id = "Password")
	private WebElement password_box;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword_box;

	@FindBy(id = "register-button")
	private WebElement register_button_box;

	
}
