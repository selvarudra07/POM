package com.definition;

import java.util.concurrent.TimeUnit;

import org.jsoup.select.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utilclass {
	
 public static WebDriver driver;

	public static WebDriver getDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void loadurl(String url)
	{
		driver.get(url);
	}
	
	@SuppressWarnings("deprecation")
	public static void ImplicitlyWaits(int mySecs) {
		driver.manage().timeouts().implicitlyWait(mySecs, TimeUnit.SECONDS);
		
	}
	
		
	public static void sendInput(WebElement element, String input)
	{
		element.sendKeys(input);
	}
	
	public static void click(WebElement element)
	{
		element.click();
	}	

}
