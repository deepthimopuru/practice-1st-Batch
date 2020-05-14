package alloopsconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ya {

	public static void holdon(WebDriver driver, WebElement locator, int timeout) {

		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver,driver,chrome", "chromedriver");

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--incognito");

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		options.merge(capabilities);

		ChromeDriver driver = new ChromeDriver(options);

		// WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.get("https://www.yahoo.com/");
		Thread.sleep(50000);

		// List<WebElement>right_Links = driver.findElements
		// (By.xpath("//li[@class='trending-list']"
		// + "/ul/li/a/span/following-sibling::span"));

		List<WebElement> right_Links = driver
				.findElements(By.xpath("//div[@id='applet_p_50000314']//li/descendant::a[@href]"));

		System.out.println(right_Links.size());

		for (int i = 0; i < right_Links.size(); i++) {

			System.out.println(right_Links.get(i).getText());

		}

		driver.quit();

	}

}
