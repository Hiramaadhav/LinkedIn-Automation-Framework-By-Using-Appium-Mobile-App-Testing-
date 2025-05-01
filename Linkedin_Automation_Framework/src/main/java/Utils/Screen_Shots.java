package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.qameta.allure.Allure;

public class Screen_Shots {

	public static void captureScreenshotForAllure(WebDriver driver, String stepName) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment(stepName, "image/png", new java.io.ByteArrayInputStream(screenshot), ".png");
	}
}
