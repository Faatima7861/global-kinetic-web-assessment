package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPF {

	public WebDriver driver;

	public CheckoutPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "shopping_cart_container")
	public WebElement shoppingCart;
	
	@FindBy(xpath = "//a[contains(text(),'CHECKOUT')]")
	public WebElement checkOut;
	
	@FindBy(xpath = "//a[contains(text(),'Continue Shopping')]")
	public WebElement continueShopping;
	
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//input[@value='CONTINUE']")
	public WebElement cont;
	
	@FindBy(xpath = "//a[contains(text(),'FINISH')]")
	public WebElement finish;
	
	@FindBy(xpath = "//a[contains(text(),'CANCEL')]")
	public WebElement cancelOrder;
	
	@FindBy(xpath = "//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]")
	public WebElement successMessage;


}
