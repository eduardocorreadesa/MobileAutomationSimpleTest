/**
 * @author Eduardo C. de S�
 *
 * 13/08/2015
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tools.WebdriverAndroid;
import components.Button;
import components.Input;

/**
 * @author eduardo.sa
 *
 */
public class Home {

	public Home() {
	}

	public void clearInputs() {
		Input.clearInput(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/txtLado1");
		Input.clearInput(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/txtLado2");
		Input.clearInput(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/txtLado3");
	}

	public void insertLado1(String lado1) {
		Input.setText(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/txtLado1", lado1);
	}
	public void insertLado2(String lado2) {
		Input.setText(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/txtLado2", lado2);
	}
	public void insertLado3(String lado3) {
		Input.setText(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/txtLado3", lado3);
	}
	public void touchCalcular() {
		Button.oneTouch(WebdriverAndroid.getInstance(), "com.eliasnogueira.trianguloapp:id/btnCalcular");
	}

	public boolean loadMsg() {
		boolean resultado;
		try {
			WebDriverWait wait = new WebDriverWait(WebdriverAndroid.getInstance(),30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.eliasnogueira.trianguloapp:id/txtResultado")));
			resultado = true;
		} catch (Exception e) {
			resultado = false;
		}
		return resultado;
	}
}
