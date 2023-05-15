package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class demouser2 extends demouser{
	WebDriver driver;
	
	demouser obj= new demouser();
	
	@Given("user launch the demoqa Web application")
	public void user_launch_the_demoqa_web_application() {
		
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.get("https://demoqa.com/text-box");
		obj.launcher("https://demoqa.com/text-box");
	}
	@When("user enters the fullname and emailid")
	public void user_enters_the_fullname_and_emailid() {
//		driver.findElement(By.id("userName")).sendKeys("ram");
//		driver.findElement(By.id("userEmail")).sendKeys("ram@yahoo.com");
		obj.inputs();
	}
	@When("user enters the current address and permanenet address")
	public void user_enters_the_current_address_and_permanenet_address() {
//		driver.findElement(By.id("currentAddress")).sendKeys("a/2 west street");
//		driver.findElement(By.id("permanentAddress")).sendKeys("a/2 west street madras");
		
		
	    	}
	@When("User needs click the submit button")
	public void user_needs_click_the_submit_button() {
		//driver.findElement(By.id("submit")).click();
	   obj.click();
	   obj.close();
	}
		
}
