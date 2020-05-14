package com.main.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class page {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public page(WebDriver driver) {
		this.driver= driver;
		this.wait = new WebDriverWait(this.driver, 15);
		
	}
	
	//abstract methods
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader();
	//public abstract Element getElement(By locator);
	
	

}
