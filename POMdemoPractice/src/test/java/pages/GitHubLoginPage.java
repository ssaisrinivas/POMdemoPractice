package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class GitHubLoginPage {
	WebDriver driver;

	public GitHubLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.id("login_field");
	By password = By.id("password");
	By login = By.xpath("//input[@name='commit']");

	public void enterUserName(String userName1) throws InterruptedException {

		WebElement el1 = driver.findElement(userName);
		el1.sendKeys(userName1);
		Thread.sleep(3000);
	}

	public void enterPassword(String pass) throws InterruptedException {

		WebElement el2 = driver.findElement(password);
		el2.sendKeys(pass);
		Thread.sleep(3000);
	}

	public GitHubHomePage logintoFB() throws InterruptedException {

		WebElement el3 = driver.findElement(login);
		Thread.sleep(3000);
		el3.click();

		// Thread.sleep(4000);
		return new GitHubHomePage(driver);
	}

}
