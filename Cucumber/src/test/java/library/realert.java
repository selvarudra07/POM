package library;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class realert {



	public static void main(String[] args) {
		demouser obj=new demouser();
		// TODO Auto-generated method stub
		//		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		//		WebDriver driver= new ChromeDriver();
		//		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		obj.launcher("https://nxtgenaiacademy.com/alertandpopup/");
		//		driver.manage().window().maximize();
		obj.max();
		//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		obj.implicit(10);
		//
		//		WebElement alertbox= driver.findElement(By.xpath("//button[text()='Alert Box']"));
		//		alertbox.click();
		//		Alert alert= driver.switchTo().alert();
		//		alert.accept();
		obj.alertbox("//button[@name='alertbox']", "click");
		//		WebElement confirmbox= driver.findElement(By.xpath(" //button[contains(text(),'Confirm')]"));
		//		confirmbox.click();
		//		Alert confirm= driver.switchTo().alert();
		//		confirm.dismiss();
		obj.confirmalert("//button[@name='confirmalertbox']", "click");
		//		WebElement promptbox= driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		//		promptbox.click();
		//		Alert prompt= driver.switchTo().alert();
		//		prompt.sendKeys("yes");
		//		prompt.accept();
		obj.promptbox("//button[@name='promptalertbox1234']", "click");
	//	obj.promptbox("//button[@name='promptalertbox1234']", "yes");
	}
}
