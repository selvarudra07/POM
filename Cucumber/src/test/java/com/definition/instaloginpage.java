package com.definition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class instaloginpage extends Utilclass{
	{
	PageFactory.initElements(driver, this);
	}

@FindBy(name="username")
private WebElement name;

@FindBy(xpath="//input[@name='username']")
private WebElement email;

@FindBy(name="password")
private WebElement inputpassword;

@FindBy(xpath="//input[@name='password']")
private WebElement pass;

@FindBy(xpath="(//div[contains(text(),'Log In')])[1]")
private WebElement button;


public WebElement getname()
{
	return name;
}

public WebElement getpass()
{
	return pass;
}

public WebElement getbutton()
{
	return button;
}

}
