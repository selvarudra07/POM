package library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookpage extends utilclass{
	{
		PageFactory.initElements(driver, this);
	}

@FindBy(name="firstname")
private WebElement name;

@FindBy(id="u_0_b_Qn")
private WebElement firstname;

@FindBy(xpath="//input[@id='u_0_d_ZG']")
private WebElement surname;

@FindBy(name="lastname")
private WebElement last;

@FindBy(xpath="//div[text()='Mobile number or email address']")
private WebElement email;

@FindBy(id="u_0_j_NJ")
private WebElement mailid;

@FindBy(xpath="//div[contains(text(),'Re-enter')]")
private WebElement reenter;

@FindBy(xpath="//input[@id='password_step_input']")
private WebElement password;

public WebElement getname()
{
	return name;
}

public WebElement getlast()
{
	return last;
}

public WebElement getemail()
{
	return email;
}

public WebElement getreenter()
{
	return reenter;
}

public WebElement password()
{
	return password;
}

}
