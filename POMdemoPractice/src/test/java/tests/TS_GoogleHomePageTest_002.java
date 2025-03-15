package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.GoogleHomePage;
import utility.GeneralUtility;

public class TS_GoogleHomePageTest_002 extends BaseClass {
	GoogleHomePage homePage;
	GeneralUtility util = new GeneralUtility(driver);

	@Test(priority = 1, description = "validate the search box in page")
	public void tc_001() throws InterruptedException, IOException {
		driver.get("https://www.google.com/");
		homePage = new GoogleHomePage(driver);
		WebElement ele = homePage.searchBox();
		ele.sendKeys("Hello World");
		ele.submit();
		Thread.sleep(3000);
		//util.screenShort("HomePage");
		Thread.sleep(3000);
	}

}
