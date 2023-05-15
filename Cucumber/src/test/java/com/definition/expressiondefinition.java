package com.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class expressiondefinition {
	WebDriver driver;

	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

	}
	@When("user enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String string, String string2) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);

	}
	@When("User click the login button")
	public void user_click_the_login_button() {
		driver.findElement(By.name("login")).click();

	}
	@Then("verify the user is navigating to home page or not")
	public void verify_the_user_is_navigating_to_home_page_or_not() {
		String title=driver.getTitle();
		System.out.println(title);

	}


}
