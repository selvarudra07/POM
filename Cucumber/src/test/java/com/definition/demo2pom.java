package com.definition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo2pom extends demopomclass{


//	public demo2pom() 
//	{
//		PageFactory.initElements(driver, this);
//	}



	@FindBy(id="userName")
	private static WebElement name;

	@FindBy(id="userEmail")
	private static WebElement email;

	@FindBy(id="currentAddress")
	private static WebElement currentadd;

	@FindBy(id="permanentAddress")
	private static WebElement permanenetadd;

	@FindBy(id="submit")
	private static WebElement button;
	
	public WebElement getname() 
	{
		return name;	
	}

	public WebElement getemail()
	{
		return email;
	}

	public WebElement getcurrentadd()
	{
		return currentadd;
	}
	public WebElement getpermanentadd()
	{
		return permanenetadd;
	}

	public WebElement getbutton()
	{
		return button;
	}
}
