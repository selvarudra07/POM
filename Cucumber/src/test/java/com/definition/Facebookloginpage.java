package com.definition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookloginpage extends Utilclass{
	public Facebookloginpage()
	
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement txtUsername;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement txtTitle;
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement buttonlogin;

	public WebElement getTxtusername()
	{
		return txtUsername;
	}
	
	public WebElement getTxtTitle()
	{
		return txtTitle;
	}

	public WebElement getTxtpassword()
	{
		return txtpassword;
	}

	public WebElement getbuttonlogin()
	{
		return buttonlogin;
	}


}
