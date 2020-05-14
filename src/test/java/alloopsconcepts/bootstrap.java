package alloopsconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrap {

	public static void main(String[] args) {

		System.setProperty("Webdriver,driver,chrome", "chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("test");

		List<WebElement> allj = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[contains(@class,'sbl1')]"));

		int numofsearches = allj.size();
		System.out.println(numofsearches);

		for (int a = 0; a < allj.size(); a++) {

			String originaltext = allj.get(a).getText();

			System.out.println(originaltext);
			if (originaltext.contains("testng")) {
				allj.get(a).click();
				break;

			}

		}

		driver.quit();

	}

}
