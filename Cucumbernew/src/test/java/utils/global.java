package utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.loginPOM;

public class global {

	public static WebDriver driver;
	
	public static WebDriver browser(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		PageFactory.initElements(driver, loginPOM.class);
		return driver;
	}

}
