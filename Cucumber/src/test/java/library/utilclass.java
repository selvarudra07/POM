package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilclass {

	public static WebDriver driver;

	public static WebDriver getDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void browser(String url)
	{
		driver.get(url);
	}

	
	@SuppressWarnings("deprecation")
	public static void wait(int delay)
	{
		driver.manage().timeouts().implicitlyWait(delay,TimeUnit.SECONDS);
	}

	public static void datainput(WebElement first,String name)
	{
		first.sendKeys(name);
	}
	
	
	public static void clickbutton(WebElement button)
	{
		button.click();
	}
}
