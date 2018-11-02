/**
 * @author Eduardo C. de S�
 *
 * 13/08/2015
 */
package tools;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.saucelabs.saucerest.SauceREST;

/**
 * @author eduardo.sa
 *
 */
public class Util {

	public static final String USERSAUCELABS = "eduardo.correa.sa";
	public static final String KEYSAUCELABS = "5a4d303e-b5d6-4121-b3b8-2562b515fe5d";
	public static String sessionId = " ";
	public static SauceREST client;


/**Curl Commands
 *
 * Upload App - curl -u eduardo.correa.sa:5a4d303e-b5d6-4121-b3b8-2562b515fe5d -X POST -H "Content-Type: application/octet-stream" https://saucelabs.com/rest/v1/storage/eduardo.correa.sa/TrianguloApp.apk?overwrite=true --data-binary @/home/eduardocorrea/Downloads/TrianguloApp.apk
 */

	public static final void screeshotOfTest() {
		String nameMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
		String namePath = nameMethod + "-" + System.currentTimeMillis()+ ".png";
		try {
			File screenshot = ((TakesScreenshot) WebdriverAndroid.getInstance()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("test-output/evidencias/" + namePath));
		} catch (Exception e) {
			System.out.println("Exception of capturing screeshot. \n"+e);
		}
	}
}
