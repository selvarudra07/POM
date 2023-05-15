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

public class democlass {
	WebDriver driver;

	@Given("user open the demoqa page")
	public void user_open_the_demoqa_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   	}
	@When("Need to insert valid inputs")
	public void need_to_insert_valid_inputs() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
				
	   	}
		@When("user insert {string} and {string}")
	public void user_insert_and(String name, String pass) {
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pass);
	 
	}

	
	@When("user have to click the submit button")
	public void user_have_to_click_the_submit_button() {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	    	}
//@Before
//
//	public void beforescenario()
//	{
//		System.out.println("launch the browser");
//	}
//@After
//
//	public void afterscenario()
//	{
//	driver.close();
//		System.out.println("close the browser");
//	}
//
//}


