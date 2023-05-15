package com.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class definition {
WebDriver driver;

@Given("user launch the Facebook Web application")
public void user_launchthe_facebook_web_application() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
    
}
@When("user enters valid username and valid password")
public void user_enters_valid_username_and_valid_password() {
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test@12345");
	driver.findElement(By.id("pass")).sendKeys("1234556677");
    
}
@When("User needs click the login button")
public void user_needs_click_the_login_button() {
	driver.findElement(By.name("login")).click();
   
}
@Then("verify user is navigating to home page or not")
public void verify_user_is_navigating_to_home_page_or_not() {
	String title = driver.getTitle();
	System.out.println(title);
    
}

}
