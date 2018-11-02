/**
 * @author Eduardo C. de S�
 *
 * 13/08/2015
 */
package tools;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.saucelabs.common.SauceOnDemandAuthentication;
import com.saucelabs.saucerest.SauceREST;

/**
 * @author eduardo.sa
 *
 */
public class CreateAmbient {

	@Parameters({ "platform", "device", "app", "name" })
	@BeforeTest
	public void iniciarInstancia(String platform, @Optional String device, @Optional String app, @Optional String name) throws MalformedURLException {
		System.out.println("----> Instance of Driver");
		System.out.println("----> Plataform: " + platform);
		System.out.println("----> Device: " + device);
		System.out.println("----> App: " + app);
		WebdriverAndroid.configureDevice(platform, device, name);
//		WebdriverAndroid.configureDevice();
//		WebdriverAndroid.configureDeviceLocal(platform, device, name);

		SauceOnDemandAuthentication authentication = new SauceOnDemandAuthentication(Util.USERSAUCELABS, Util.KEYSAUCELABS);
	    Util.client = new SauceREST(authentication.getUsername(), authentication.getAccessKey());
		Util.sessionId = (((RemoteWebDriver) WebdriverAndroid.getInstance()).getSessionId()).toString();
		System.out.println("ID Session: "+Util.sessionId);
	}

	@AfterTest
	public void finalizar() {
		System.out.println("----> Quit of Driver.");
		WebdriverAndroid.quitInstance();
	}

	// @AfterTest
	public void tearDown(ITestResult result) {
		System.out.println("Results: "+result.getStatus());
	   if (result.getStatus() == ITestResult.SUCCESS) {
		   Util.client.jobPassed(Util.sessionId);
	   }else if(result.getStatus() == ITestResult.FAILURE){
		   Util.client.jobFailed(Util.sessionId);
	   } else if(result.getStatus() == ITestResult.SKIP){
		   Util.client.jobFailed(Util.sessionId);
	   }
	}

}
