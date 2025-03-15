package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class GoogleHomePage {
	WebDriver driver;
	public GoogleHomePage(WebDriver driver) {		
		this.driver=driver;		
	}
	By searchBoxLocator = By.xpath("//textarea[@id='APjFqb']");

	public WebElement searchBox(){
		WebElement element = driver.findElement(searchBoxLocator);
		return element;
	}
}
