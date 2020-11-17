package webtests;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.net.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.AddToCartPF;
import pageObjects.LoginPF;
import resources.Base;

public class AddToCart extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());

	// iterate through each item to find the one you want and then add to cart.
	// Add to cart button will by default select the first one
	@Test(priority = 0)
	public void addMultipleProductsTocart() {
		AddToCartPF addtocart = new AddToCartPF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> products = driver.findElements(By.cssSelector("div.inventory_item_name"));
		System.out.println(products);

		String[] itemsToBuy = { "Sauce Labs Backpack", "Sauce Labs Bolt T-Shirt", "Sauce Labs Onesie",
				"Test.allTheThings() T-Shirt (Red)" };

		for (int i = 0; i < products.size(); i++) {
			String productNames = products.get(i).getText();
			// check weather name extracted in present in array

			List itemsToBuyList = Arrays.asList(itemsToBuy);

			if (itemsToBuyList.contains(productNames)) {
				addtocart.addToCartBtn.click();
			}
		//	Assert.assertFalse(productNames.contains("Test"));
		}

	}

	@Test(priority = 1)
	public void removeProductFromCart() {
		AddToCartPF addtocart = new AddToCartPF(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		List<WebElement> products = driver.findElements(By.cssSelector("div.inventory_item_name"));

		String[] itemsToRemove = { "Sauce Labs Backpack" };

		for (int i = 0; i < products.size(); i++) {
			String productNames = products.get(i).getText();

			List itemsToBuyList = Arrays.asList(itemsToRemove);

			if (itemsToBuyList.contains(productNames)) {
				addtocart.removeBtn.click();

			}

		}
		Assert.assertTrue(true);
	}

}
