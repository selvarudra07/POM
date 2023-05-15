package com.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demopomclass {
	static WebDriver driver;

	public static WebDriver launcher(String url) 
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	PageFactory.initElements(driver, demo2pom.class);
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy (0,-10000)");
	return driver;
	}

}
