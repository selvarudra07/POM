package com.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class expressiondefinition2 {
	WebDriver driver;

	@Given("User is on the gmail page")
	public void user_is_on_the_gmail_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");

	}
	@When("User enter the mailid {string} and click next button")
	public void user_enter_the_mailid_and_click_next_button(String Email) {
		driver.findElement(By.id("identifierId")).sendKeys("test123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}
	@When("User enter the password {string} and click next button")
	public void user_enter_the_password_and_click_next_button(String Password) {
		driver.findElement(By.name("password")).sendKeys("12345asdfg");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	@Then("User verify the login page or not")
	public void user_verify_the_login_page_or_not() {

		String done=driver.getTitle();
		System.out.println(done);

	}



}
