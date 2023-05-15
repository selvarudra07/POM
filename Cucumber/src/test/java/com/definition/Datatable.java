package com.definition;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datatable {
	WebDriver driver;

	@Given("User access the login page")
	public void user_access_the_login_page() throws Throwable {	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}
	    
	@When("User enter the below credentials")
	public void user_enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) throws Throwable {
		List<String> credentials=dataTable.asList(String.class);
		String username=credentials.get(0);
		String password=credentials.get(1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	
	}
@When("user click the login button")
	public void user_click_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	   
	}
	@Then("User will navigate the homepage")
	public void user_will_navigate_the_homepage() throws Throwable {
	   
		String done=driver.getTitle();
		System.out.println(done);
	}

}
