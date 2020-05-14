package alloopsconcepts;

import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public static WebDriver driver;
	

	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		}
	
	/*public void getscreenshot(String MethodName) {
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("/Users/pkd/eclipse-workspace/alloopsconcepts/shots" + MethodName+ ".jpg") );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		*/
	
	
	
	public void  shot(String methodname) {
		
		
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(scrfile, new File("Users/pkd/eclipse-workspace/alloopsconcepts/shots"+ methodname +"_" + ".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
		
	}
	
	
	
	

}
