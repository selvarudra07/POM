package stepdefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.loginPOM;
import utils.global;

public class defenition extends loginPOM{

loginPOM obj = new loginPOM();

@Given("User open the facebook login page url")
public void user_open_the_orangehrm_login_page_url() throws InterruptedException {
    browser("https://www.facebook.com");
}
@When("User enters the email and password")
public void user_enters_the_email_and_password() {
    getUsername().sendKeys("abc@gmail.com");
    getPassword().sendKeys("12345678");
	
}

@When("user enter {string} and  {string}")
public void user_enter_and(String name, String pass) {
getUsername().sendKeys(name);  
getPassword().sendKeys(pass);
}
@When("user click the login button")
public void user_click_the_login_button() {
	
	getLogin().click();
   
}


	
}
