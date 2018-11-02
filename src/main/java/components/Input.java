/**
 * @author Eduardo C. de S�
 *
 * 13/08/2015
 */
package components;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author eduardo.sa
 *
 */
public class Input {

	@SuppressWarnings("rawtypes")
	public static void setText(AndroidDriver driver, String id, String valor){
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(id))).sendKeys(valor);
		} catch (Exception e) {
			System.out.println("Fail insert value. "+id);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void clearInput(AndroidDriver driver, String id){
		try {
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.elementToBeClickable(By.id(id))).clear();
		} catch (Exception e) {
			System.out.println("Fail insert value. "+id);
		}
	}
}
