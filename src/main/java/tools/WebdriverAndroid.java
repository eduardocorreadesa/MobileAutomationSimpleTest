/**
 * @author Eduardo C. de S�
 *
 * 13/08/2015
 */
package tools;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


/**
 * @author eduardo.sa
 *
 */
public class WebdriverAndroid {

	@SuppressWarnings("rawtypes")
	private static AndroidDriver driver;


	@SuppressWarnings("rawtypes")
	public static void configureDevice(String platform, String device, String name) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("name", name);
		caps.setCapability("app","sauce-storage:TrianguloApp.apk");
		caps.setCapability("app-package","com.eliasnogueira.trianguloapp");		
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","Samsung Galaxy S4 Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("platformVersion","4.4");
		caps.setCapability("platformName","Android");

		driver = new AndroidDriver(new URL("http://"+Util.USERSAUCELABS+":"+Util.KEYSAUCELABS+"@ondemand.saucelabs.com:80/wd/hub"), caps);

	}

	@SuppressWarnings("rawtypes")
	public static AndroidDriver getInstance() {
		if (driver == null) {
			System.out.println("---> Driver == null");
		}
		return driver;
	}

	public static void quitInstance() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
