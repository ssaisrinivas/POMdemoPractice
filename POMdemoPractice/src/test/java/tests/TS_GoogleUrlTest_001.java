package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class TS_GoogleUrlTest_001 extends BaseClass{

	@Test(priority = 1)
	public void tc_01() {
		driver.get("https://www.google.com/");
		String expected = "Google";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}
}
