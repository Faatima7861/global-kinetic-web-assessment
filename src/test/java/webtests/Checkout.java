package webtests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import TestData.DataGenerator;
import junit.framework.Assert;
import pageObjects.CheckoutPF;
import resources.Base;

public class Checkout extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	@Test(priority = 0)
	public void goToCheckOut() {
		CheckoutPF checkout = new CheckoutPF(driver);
		checkout.shoppingCart.click();
		//driver.findElement(By.id("shopping_cart_container")).click();
	    checkout.checkOut.click();
		
	}
	
	
	@Test(priority = 1)
	public void enterDetails() {
		CheckoutPF checkout = new CheckoutPF(driver);
		DataGenerator dataGen = new DataGenerator();
		checkout.firstName.sendKeys(dataGen.firstNameGen(8));
		checkout.lastName.sendKeys(dataGen.surnameGen(8));
		checkout.zipCode.sendKeys(dataGen.zipCodeGen(4));
		checkout.cont.click();
		checkout.finish.click();
		Assert.assertTrue(true);
	}		
	
}
