/**
 * @author Eduardo C. de S�
 *
 * 06/08/2015
 */
package tests;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Home;
import tools.Util;

/**
 * @author eduardo.sa
 *
 */
public class HomeTest {

	@Test
	public void testMsg() throws ClientProtocolException, IOException, InterruptedException{
		Home h = new Home();
		System.out.println("Test - Check input null feedback");	

		h.clearInputs();
		h.touchCalcular();
		Assert.assertEquals(h.loadMsg(), true);
		Util.screeshotOfTest();
	}
	
	@Test
	public void testCalcEquilatero() throws ClientProtocolException, IOException, InterruptedException{
		Home h = new Home();
		System.out.println("Test - Calculate Triangle Equilatero");	

		h.insertLado1("10");
		h.insertLado2("10");
		h.insertLado3("10");
		h.touchCalcular();
		Assert.assertEquals(h.loadMsg(), true);
		Util.screeshotOfTest();
	}

	@Test
	public void testCalcoEscaleno() throws ClientProtocolException, IOException, InterruptedException{
		Home h = new Home();
		System.out.println("Test - Calculate Triangle Escaleno");	

		h.insertLado1("1");
		h.insertLado2("2");
		h.insertLado3("3");
		h.touchCalcular();
		Assert.assertEquals(h.loadMsg(), true);
		Util.screeshotOfTest();
	}

}
