package com.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class insta {
	WebDriver driver;
	
	@Given("User launch the Instagram Web application")
	public void user_launch_the_instagram_web_application() {
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
	    
	}
	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ram@12345678");
	    driver.findElement(By.name("password")).sendKeys("123456678");
	}
	@When("User needs to click the login button")
	public void user_needs_to_click_the_login_button() {
	   driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}
	@Then("Verify user is navigating to home page or not")
	public void verify_user_is_navigating_to_home_page_or_not() {
	   String title=driver.getTitle();
	   System.out.println("done");
	}

}
