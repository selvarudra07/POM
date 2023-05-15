package com.definition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class twitterlogin extends Utilclass{
	
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name='text']")
	private WebElement name;
	
	@FindBy(name="text")
	private WebElement username;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement login;

	public WebElement getname()
	{
		return name;
	}
	
	public WebElement getnext()
	{
		return next;
	}
	
	public WebElement getpassword()
	{
		return password;
	}
	
	public WebElement getlogin()
	{
		return login;
	}
	
	
	
	
	
	
	
	
}
