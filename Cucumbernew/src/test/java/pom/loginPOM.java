package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.global;

public class loginPOM extends global {
	
//	public loginPOM() 
//	{
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
	
	@FindBy(id="email")
	private static WebElement username;
	
	@FindBy(id="pass")
	private static WebElement password;
	
	@FindBy(name="login")
	private static WebElement login;
	


	public  WebElement getUsername() {
		return username;
	}

	public  WebElement getPassword() {
		return password;
	}

	public  WebElement getLogin() {
		return login;
	}
	

	

	
	
	
}
