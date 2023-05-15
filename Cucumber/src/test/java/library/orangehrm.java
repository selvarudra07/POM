package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {
	WebDriver driver;
	

	@Given("User launch the orangehrm Web application")
	public void user_launch_the_orangehrm_web_application() {
		 WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("User must needs to click the login button")
	public void user_must_needs_to_click_the_login_button() throws InterruptedException {

		  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		  Thread.sleep(3000);
	   	}

	@When("User insert the {string}  {string}")
	public void user_insert_the(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	}

	@When("User click the loginbutton")
	public void user_needs_to_click_the_loginbutton() throws InterruptedException {
		  driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 
	}
	
//	@Before
//	
//		public void beforescenario() throws InterruptedException
//		{
//		System.out.println("launch the browser");
//		Thread.sleep(3000);
//	}
//	@After
//	public void afterscenario()
//	{
//		driver.close();
//		System.out.println("close the browser");
//	}


}
