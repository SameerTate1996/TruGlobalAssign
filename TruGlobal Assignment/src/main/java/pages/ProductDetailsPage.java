package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import BaseTest.BaseClass;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ProductDetailsPage extends BaseClass {

	public By priceOfProduct = By.xpath("(//span[@aria-hidden='true']/span[@class='a-price-whole'])[last()]");
	public By addToCartbtn = By.xpath("(//input[@value='Add to Cart'])[last()]");

	public void storedPrice() {

		String PriceOfIphone = driver.findElement(priceOfProduct).getText();

		System.out.println(PriceOfIphone);
	}

	public void clickOnAddToCart() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		driver.findElement(addToCartbtn).click();
	}

}
