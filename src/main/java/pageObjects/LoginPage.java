package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// landing page
	@FindBy(xpath = "//span[@class='open-btn-text']")
	public WebElement BtnClick;
	@FindBy(xpath = "//div[contains(text(),'Need help? / Give us feedback')]")
	public WebElement getNeedhelp;

	// login page objects
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement enterPhoneNumber;
	@FindBy(xpath = "//input[@id='standard-name']")
	public WebElement enterPassword;
	@FindBy(xpath = "//div[@class='otp-separator']//div[1]//input[1]")
	public WebElement enterOtp1;
	@FindBy(xpath = "//div[@class='jss55 jss58 jss63 jss72']//div[2]//input[1]")
	public WebElement enterOtp2;
	@FindBy(xpath = "//div[@class='jss152 jss160 jss175']//div[3]//input[1]")
	public WebElement enterOtp3;
	@FindBy(xpath = "//div[4]//input[1]")
	public WebElement enterOtp4;
	@FindBy(xpath = "//div[5]//input[1]")
	public WebElement enterOtp5;
	@FindBy(xpath = "//div[6]//input[1]")
	public WebElement enterOtp6;

}
