package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {

	public WebDriver driver;

	public LoginPF(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginBtn;

	@FindBy(xpath = "//img[@class='bot_column']")
	public WebElement botImage;

	@FindBy(xpath = "//h3[1]")
	public WebElement loginError;
	
	
	

}
