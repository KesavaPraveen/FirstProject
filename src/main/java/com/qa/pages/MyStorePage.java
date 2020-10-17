package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.resources.Base;

public class MyStorePage extends Base{
	
	// Page Factory
	
	@FindBy(xpath="//a[@class='login']")
	WebElement signinlink;
	
	//Initializing the Page Objects:
		public MyStorePage(){
			PageFactory.initElements(driver, this);
		}

	// Actions:
		public void signin_linkclick()
		{
			signinlink.click();
		}
}
