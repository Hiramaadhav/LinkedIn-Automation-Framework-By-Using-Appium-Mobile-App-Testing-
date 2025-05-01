package Utils;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Driver_Manager {

	public static AndroidDriver driver;

	public static void startdriver() {
		try {
			UiAutomator2Options options = new UiAutomator2Options();
			options.setPlatformName("Android");
			options.setDeviceName("realme RMX3771");
			options.setAppPackage("com.linkedin.android");
			options.setAppActivity("com.linkedin.android.infra.navigation.MainActivity");
			options.setAutomationName("UiAutomator2");

			URL url = new URL("http://127.0.0.1:4723/");
			driver = new AndroidDriver(url, options);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void enddriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}