package alloopsconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class freecrmxpath {

	public static void main(String[] args) {
		System.setProperty("Webdriver,driver,chrome", "chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://ui.freecrm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("deepthimopuru12@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("@12August");
		driver.findElement(By.xpath("//div[contains(@class,'ui fluid large blue submit button')]")).click();
		// driver.switchTo().frame("Twitter settings iframe");
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		// driver.switchTo().frame("Twitter settings iframe");

		List<WebElement> all = driver.findElements(By.xpath("//div[@id='main-nav']//a/descendant::span"));

		System.out.println(all.size());

		for (int i = 0; i < all.size(); i++) {

			System.out.println(all.get(i).getText());
			if (all.get(i).getText().contains("Documents")) {
				all.get(i).click();
			}

		}

		driver.quit();

	}

}
