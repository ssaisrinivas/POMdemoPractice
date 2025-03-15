package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import base.BaseClass;

public class GeneralUtility extends BaseClass {

	public GeneralUtility(WebDriver driver) {
		this.driver = driver;
	}

	public void screenShort(String name) throws IOException {

		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("D:/Eclipse-23-24/POMdemo/Screenshot/" +name+".png" );
		Files.copy(src, dst);
	}
}
