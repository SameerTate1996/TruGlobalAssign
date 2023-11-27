package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseTest.BaseClass;

public class PhoneSearchResult extends BaseClass {

	public By priceunderThousand = By.xpath("//span[text()='Under ₹1,000']");
	public By priceOfFilteredProducts = By
			.xpath("//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole']");

	public void clickOnUnderThousand() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(priceunderThousand).click();

	}

	public void validatePhonePriceAfterFilter() {

		List<WebElement> FilteredProducts = driver.findElements(priceOfFilteredProducts);
		System.out.print("Filtered Prices of phone : ");
		for (WebElement e : FilteredProducts) {
			int value = Integer.parseInt(e.getText());
			System.out.print(" " + value);
			Assert.assertTrue(value < 1000, "Product is not less than 1000");
		}
	}
}
