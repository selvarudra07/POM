package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef extends demouser{
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("User enters the valid credentials {string} and {string}")
	public void user_enters_the_valid_credentials_and(String string, String string2) {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

	}

	@When("Cicks the login button")
	public void cicks_the_login_button() {
		
		 driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}


}
