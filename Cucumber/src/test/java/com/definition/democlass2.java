package com.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class democlass2 extends demo2pom{
	
	demo2pom obj= new demo2pom();
	WebDriver driver;
	@Given("user enter in to demourl")
	public void user_enter_in_to_demourl()
	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		launcher("https://demoqa.com/text-box");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	}
	@When("user enter the below details")
	public void user_enter_the_below_details() throws InterruptedException 
	{
//		driver.findElement(By.id("userName")).sendKeys("ram");
//		driver.findElement(By.id("userEmail")).sendKeys("asdf@1234");
//		driver.findElement(By.id("currentAddress")).sendKeys("12/8 west street");
//		driver.findElement(By.id("permanentAddress")).sendKeys("12/8 west street madras");
	  getname().sendKeys("amin");
	  getemail().sendKeys("asd@123");
	  getcurrentadd().sendKeys("124/78");
	  getpermanentadd().sendKeys("12/assd21");
//	  JavascriptExecutor j=(JavascriptExecutor)driver;
	  Thread.sleep(3000);
//	  j.executeScript("window.scrollBy (0,-500)");
	}
	
	@Then("Click the submit button")
	public void click_the_submit_button()
	{
//		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		getbutton().click();
	    
	}


}
