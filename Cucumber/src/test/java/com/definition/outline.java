package com.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import library.demouser;

public class outline extends demouser {
	
	WebDriver driver;
	
	demouser obj =new demouser();
	
	@Given("User launch the facebook web application")
	public void user_launch_the_facebook_web_application() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/login/");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//obj.launcher("https://www.facebook.com/login/");
	}
	@When("User enters the valid username and valid password")
	public void user_enters_the_valid_username_and_valid_password() {
	    driver.findElement(By.id("email")).sendKeys("abc123");
	    driver.findElement(By.name("pass")).sendKeys("112235654");
		
		//obj.sendInput();
	}
	@When("user needs to click the login button")
	public void user_needs_to_click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.name("pass")).sendKeys(password);
	   
	}

	@When("User have to click the  button")
	public void user_have_to_click_the_button() {
		
		driver.findElement(By.name("login")).click();
	   
	}

//	@Before
//	public void beforescenario()
//	{
//		System.out.println("launch the browser");
//	}
//	
//	@After
//	public void afterscenario()
//	{
//		driver.close();
//		System.out.println("close the browser");
//	}
	

}
