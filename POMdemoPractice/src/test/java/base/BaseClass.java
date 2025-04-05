package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		System.out.println("closing browser");
		driver.quit();

	}

}
