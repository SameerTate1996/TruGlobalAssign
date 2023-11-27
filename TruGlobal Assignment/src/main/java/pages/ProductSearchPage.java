package pages;

import org.openqa.selenium.By;

import BaseTest.BaseClass;

public class ProductSearchPage extends BaseClass {

	public By productResults = By.xpath("//div[contains(@class,'section')]/h2/a/span");

	public void clickOnproductResults() {

		driver.findElement(productResults).click();

	}

}
