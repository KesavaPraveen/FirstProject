package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.resources.Base;

public class LoginPage extends Base{

	
	@FindBy(id="email_create")
	WebElement email;
	
	@FindBy(id="SubmitCreate")
	WebElement submitbtn;
	
	@FindBy(id="email")
	WebElement emailadd;
	
	@FindBy(id="passwd")
	WebElement passwd;
	
	@FindBy(id="SubmitLogin")
	WebElement sbLoginbtn;
	
	
	
	
	//Initializing the Page Objects:
	public LoginPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	//Actions:
	
	public void enteremail(String emailtext)
	{
		email.sendKeys(emailtext);
	}
	
	public void clicksubmitbtn()
	{
		submitbtn.click();
	}
		
	public void enteremailadd(String emailaddtext)
	{
		emailadd.sendKeys(emailaddtext);
	}
	
	public void enterpass(String passwdtext)
	{
		passwd.sendKeys(passwdtext);
	}	
	
	public void clicksbbtn()
	{
		sbLoginbtn.click();
	}
}
