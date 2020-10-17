package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.resources.Base;

public class MyAccountPage extends Base{

	@FindBy(xpath="//a[@class='logout']")
	WebElement signoutlink;
	
	
	//Initializing the Page Objects:
			public MyAccountPage(){
				PageFactory.initElements(driver, this);
			}
	//Actions:
	public void signout_linkclick()
	{
		signoutlink.click();
	}
}
