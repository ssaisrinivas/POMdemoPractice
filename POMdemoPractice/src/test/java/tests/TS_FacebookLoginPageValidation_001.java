package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.GitHubHomePage;
import pages.GitHubLoginPage;

public class TS_FacebookLoginPageValidation_001 extends BaseClass {

	GitHubHomePage ghHomePage;
	GitHubLoginPage testlogin;

	@Test(priority = 1)
	public void tc_001() throws InterruptedException {
		driver.get("https://github.com/login");
		testlogin = new GitHubLoginPage(driver);
		testlogin.enterUserName("ssaisrinivas22@gmail.com");
		testlogin.enterPassword("$Ss9704312287");
		ghHomePage = testlogin.logintoFB();
	}

	@Test(priority = 2)
	public void tc_002() {
		ghHomePage.validateHomePage();
	}

}
