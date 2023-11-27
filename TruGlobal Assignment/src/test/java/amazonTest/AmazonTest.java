package amazonTest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BaseTest.BaseClass;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.ProductSearchPage;
import pages.PhoneSearchResult;
import utilities.Utility;

public class AmazonTest extends BaseClass {

	HomePage homePage;
	ProductSearchPage productSearchPage;
	ProductDetailsPage productDetailsPage;
	PhoneSearchResult phoneSearchResult;
	Utility util;

	public AmazonTest() {
		homePage = new HomePage();
		productSearchPage = new ProductSearchPage();
		productDetailsPage = new ProductDetailsPage();
		phoneSearchResult = new PhoneSearchResult();
		util = new Utility();
	}

	@Test
	public void searchIphone() {

		InitializeBrowser();
		util.waitForElementPresent(homePage.searchBox);
		homePage.searchProduct();
		util.waitForElementPresent(productSearchPage.productResults);
		productSearchPage.clickOnproductResults();
		util.tabSwitch(1);
		util.waitForElementPresent(productDetailsPage.priceOfProduct);
		productDetailsPage.storedPrice();
		util.waitForElementPresent(productDetailsPage.addToCartbtn);
		productDetailsPage.clickOnAddToCart();

	}

	@Test
	public void searchPhone() throws InterruptedException {

		InitializeBrowser();
		util.waitForElementPresent(homePage.searchBox);
		homePage.searchPhone();
		util.waitForElementPresent(phoneSearchResult.priceunderThousand);
		phoneSearchResult.clickOnUnderThousand();
		util.waitForElementPresent(phoneSearchResult.priceOfFilteredProducts);
		phoneSearchResult.validatePhonePriceAfterFilter();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
