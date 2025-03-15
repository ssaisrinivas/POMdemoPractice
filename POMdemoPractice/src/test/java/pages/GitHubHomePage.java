package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHubHomePage {
	WebDriver driver;

	public GitHubHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By SearchFacebook = By.xpath("//a[@class='AppHeader-logo ml-2']//*[name()='svg']");

	public void validateHomePage() {
		driver.findElement(SearchFacebook).isDisplayed();
	}

}
