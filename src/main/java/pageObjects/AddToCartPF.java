package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPF {

	public WebDriver driver;

	public AddToCartPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[text()='ADD TO CART']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath = "//button[contains(text(),'REMOVE')]")
	public WebElement removeBtn;
	
	@FindBy(xpath = "//a[@class='regions europe']")
	public WebElement europe;

	

	

}
