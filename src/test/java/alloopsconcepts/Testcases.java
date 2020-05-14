package alloopsconcepts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class Testcases extends Base {

	@BeforeMethod
	public void setup() {
		initialization();
	}

	@Test
	public void deepthi() {

		Assert.assertEquals(true, false);

	}

	@Test
	public void pradeep() {
		Assert.assertEquals(false, true);
	}

	@AfterMethod
	public void tear() {
		driver.quit();
	}

}
