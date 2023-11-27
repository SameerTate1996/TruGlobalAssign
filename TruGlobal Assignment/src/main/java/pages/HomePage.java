package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BaseClass;

public class HomePage extends BaseClass {

	public By searchBox = By.xpath("//input[@type='text']");
	public By searchBtn = By.xpath("//input[@type='submit']");

	public void searchProduct() {

		driver.findElement(searchBox).sendKeys("Iphone");
		driver.findElement(searchBtn).click();
	}

	public void searchPhone() {

		driver.findElement(searchBox).sendKeys("Phone");
		driver.findElement(searchBtn).click();

	}

}
