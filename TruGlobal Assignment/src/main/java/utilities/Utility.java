package utilities;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseTest.BaseClass;

public class Utility extends BaseClass {

	public void tabSwitch(int tabNo) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabNo));

	}
	
	public void waitForElementPresent(By element) {
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(30));
	    w.until(ExpectedConditions.presenceOfElementLocated (element));
	}

}
