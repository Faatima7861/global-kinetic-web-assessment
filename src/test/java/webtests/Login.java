package webtests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LoginPF;
import resources.Base;

public class Login extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	// Comment out headless mode and uncomment the @BeforeTest to view the browser
	// Headless testing
	// WebDriver driver = new HtmlUnitDriver();

	// Non-headless testing
	@BeforeClass
	public void initialize() throws IOException {
		driver = initializeDriver();
		// driver.get("https://www.saucedemo.com/");
		// String title = driver.getTitle();
		// System.out.print("Title is " + title);
		// Assert.assertTrue(title.contains("Swag Labs"));
	}

	@Test(priority = 0)
	public void titleTest() throws IOException {

		String url = prop.getProperty("url");
		System.out.println(url);
		driver.get(url);

		driver.manage().window().maximize();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		String ExpectedTitle = "Swag Labs";
		System.out.println("Title is " + " " + ActualTitle);
		Assert.assertNotNull(ActualTitle);
		Assert.assertTrue(ActualTitle.contains("Swag Labs"));
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	@Test(priority = 1)
	public static void testLoginFail() {
		LoginPF login = new LoginPF(driver);
		login.loginBtn.click();
		String ActualText = login.loginError.getText();
		System.out.println(ActualText);
		Assert.assertFalse(false);

	}

	@Test(priority = 2)
	public void testLoginStandardUser() throws IOException {
		LoginPF login = new LoginPF(driver);

		String username1 = prop.getProperty("username1");
		System.out.println(username1);

		String password = prop.getProperty("password");
		System.out.println(password);

		login.username.sendKeys(username1);
		login.password.sendKeys(password);
		login.loginBtn.click();
		Assert.assertTrue(true);
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		driver = null;

	}

}
