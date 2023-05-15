package library;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demouser {

	static WebDriver driver;

		public WebDriver launcher(String url) 
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.get(url);
		return driver;
		}
		
		public void max()
		{
			driver.manage().window().maximize();
		}
		
		public void implicit(int wait)
		{
			driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
		}
		
		public void alertbox(String xpath,String click)
		{
			driver.findElement(By.xpath(xpath)).click();
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		
		public void confirmalert(String xpath,String click)
		{
			driver.findElement(By.xpath(xpath)).click();
			Alert confirmalert=driver.switchTo().alert();
			confirmalert.dismiss();
		}
		
		
		public void promptbox(String xpath,String click)
		{
			driver.findElement(By.xpath(xpath)).click();
			Alert promptbox=driver.switchTo().alert();
			promptbox.sendKeys("yes");
			promptbox.accept();
		}
		
		public void sendInput()

		{
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		}
		 
		public void orangebutton()
		{
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		}
		
		
		public void inputs()
		{
			driver.findElement(By.id("userName")).sendKeys("ram");
			driver.findElement(By.id("userEmail")).sendKeys("ram@yahoo.com");
			driver.findElement(By.id("currentAddress")).sendKeys("a/2 west street");
			driver.findElement(By.id("permanentAddress")).sendKeys("a/2 west street madras");
		
		}
		
		public void click()
		{
			driver.findElement(By.id("submit")).click();
		}
		
		
		
		
		
		
		
	
	//	public WebDriver browser(String url) {
	//		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	//		driver=new ChromeDriver();
	//		driver.get(url);
	//		return driver;
	//		
	//	}
	//	
	//	public void max()
	//	{
	//		driver.manage().window().maximize();
	//	}
	//	
	//	public void implicity(int wait)
	//	{
	//		driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
	//	}
	//	
	//	public void name(String xpath,String name)
	//	{
	//		driver.findElement(By.xpath(xpath)).sendKeys(name);
	//	}
	//	
	//	public void email(String xpath,String mail)
	//	{
	//		driver.findElement(By.xpath(xpath)).sendKeys(mail);
	//	}
	//	
	//	public void current(String xpath,String address)
	//	{
	//		driver.findElement(By.xpath(xpath)).sendKeys(address);
	//	}
	//	
	//	public void permanent(String xpath,String address)
	//	{
	//		driver.findElement(By.xpath(xpath)).sendKeys(address);
	//	}
	//	
	//	public void thread() throws InterruptedException
	//	{
	//		Thread.sleep(5000);
	//	}
	//	
	//	public void button(String login)
	//	{
	//		driver.findElement(By.xpath(login)).click();
	//	}
	//	
	//	



//		public WebDriver browser(String url) {
//			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
//			driver=new ChromeDriver();
//			driver.get(url);
//			return driver;
//		}
//	
//		public void inputxpath(String xpath,String myValues) {
//			driver.findElement(By.xpath(xpath)).sendKeys(myValues);
//		}
//	
//		public void passxpath(String xpath,String password) {
//			driver.findElement(By.xpath(xpath)).sendKeys(password);
//		}
//		public void xpathclick(String xpath) {
//			driver.findElement(By.xpath(xpath)).click();
//		}
//	
//		public void max()
//		{
//			driver.manage().window().maximize();
//		}
//	
//		public void implicit(int delayTime)
//		{
//			driver.manage().timeouts().implicitlyWait(delayTime,TimeUnit.SECONDS);
//		}
//	
//	
//		public void forget(String xpath) {
//			driver.findElement(By.xpath(xpath)).click();
//		}


	//public WebDriver main(String url)
	//{
	//	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	//	driver=new ChromeDriver();
	//	driver.get(url);
	//	return driver;
	//}
	//
	//public void max()
	//{
	//	driver.manage().window().maximize();
	//}
	//
	//public void implicit(int wait)
	//{
	//	driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
	//}
	//
	//public void text(String xpath,String name)
	//{
	//	driver.findElement(By.xpath(xpath)).sendKeys(name);
	//}
	//
	//public void thread() throws InterruptedException
	//{
	//	Thread.sleep(3000);
	//}
	//public void all(String xpath)
	//{
	//	driver.findElement(By.xpath(xpath)).click();
	//	
	//}
	//
	//public void close()
	//{
	//	driver.close();
	//}

//	public WebDriver twitter(String url)
//	{
//		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get(url);
//		return driver;
//	}
//
//	public void max()
//	{
//		driver.manage().window().maximize();
//	}
//
//	public void implicit(int wait)
//	{
//		driver.manage().timeouts().implicitlyWait(wait,TimeUnit.SECONDS);
//	}
//
//	public void google(String click)
//	{
//		driver.findElement(By.xpath(click)).click();
//	}
//	public void account(String url)
//	{
//		driver.get(url);
//	}
//	public void username(String xpath,String name)
//	{
//		driver.findElement(By.xpath(xpath)).sendKeys(name);
//	}
//
//	public void button(String next)
//	{
//		driver.findElement(By.xpath(next)).click();
//	}
//
//	public void password(String xpath,String pass)
//	{
//		driver.findElement(By.xpath(xpath)).sendKeys(pass);
//	}
//
//	public void help(String helpclick)
//	{
//		driver.findElement(By.xpath(helpclick)).click();
//	}
	public void close()
	{
		driver.close();
	}

}













