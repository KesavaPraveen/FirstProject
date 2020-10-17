package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.resources.Base;

public class NewUserCreationPage extends Base{

	@FindBy(id="id_gender1")
	WebElement malegender;
	
	@FindBy(id="id_gender2")
	WebElement femalegender;
	
	@FindBy(name="name customer_firstname")
	WebElement custfname;
	
	@FindBy(name="name customer_lastname")
	WebElement custlname;
	
	@FindBy(id="email")
	WebElement email1;
	
	@FindBy(id="passwd")
	WebElement pwd;
	
	@FindBy(id="days")
	WebElement days;
	
	@FindBy(id="months")
	WebElement months;
	
	@FindBy(id="years")
	WebElement years;
	
	@FindBy(id="newsletter")
	WebElement newsletter;
	
	@FindBy(id="optin")
	WebElement specialoffer;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement state;
	
	@FindBy(id="postcode")
	WebElement pcode;
	
	@FindBy(id="id_country")
	WebElement country;
	
	@FindBy(id="other")
	WebElement othinfo;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="phone_mobile")
	WebElement mobile;
	
	@FindBy(id="alias")
	WebElement alias_add;
	
	@FindBy(id="submitAccount")
	WebElement reg_btn;	
	
	//Initializing the Page Objects:
	public NewUserCreationPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void malegenderclick()
	{
		malegender.click();
	}
	
	public void femalegenderclick()
	{
		femalegender.click();
	}
	
	public void enterfirstname(String fnametext)
	{
		custfname.sendKeys(fnametext);
	}
	
	public void enterlasttname(String lnametext)
	{
		custlname.sendKeys(lnametext);
	}
	
	public void enteremail(String emailtext)
	{
		email1.sendKeys(emailtext);
	}
	
	public void enterpassword(String pass)
	{
		pwd.sendKeys(pass);
	}
	
	public  void dateDropDown(String day) {
	      Select drop = new Select(days);
	      drop.selectByValue(day);  
	}
	
	public  void monthDropDown(String month) {
	      Select drop1 = new Select(months);
	      drop1.selectByVisibleText(month);  
	}
	
	public  void yearDropDown(String year) {
	      Select drop2 = new Select(years);
	      drop2.selectByValue(year);  
	}
	
	public void newsltrclick()
	{
		newsletter.click();
	}
	
	public void spclofrclick()
	{
		specialoffer.click();
	}
	
	public void enterfname(String firstnametext)
	{
		firstname.sendKeys(firstnametext);
	}
	
	public void enterlname(String lastnametext)
	{
		lastname.sendKeys(lastnametext);
	}
	
	public void enteraddline1(String addline1text)
	{
		address1.sendKeys(addline1text);
	}
	
	public void enteraddline2(String addline2text)
	{
		address2.sendKeys(addline2text);
	}
	
	public void entercity(String citytext)
	{
		city.sendKeys(citytext);
	}
	
	public  void stateDropDown(String statetext) {
	      Select drop3 = new Select(state);
	      drop3.selectByVisibleText(statetext);  
	}
	
	public void enterpcode(String zipcodetext)
	{
		pcode.sendKeys(zipcodetext);
	}
	
	public  void countryDropDown(String countrytext) {
	      Select drop4 = new Select(country);
	      drop4.selectByVisibleText(countrytext);  
	}
	
	public void additionalinfo(String othinfotext)
	{
		othinfo.sendKeys(othinfotext);
	}
	
	public void phone(String phonetext)
	{
		phone.sendKeys(phonetext);
	}
	
	public void mobile(String mobiletext)
	{
		mobile.sendKeys(mobiletext);
	}
	
	public void aliasadd(String aliasaddresstext)
	{
		alias_add.sendKeys(aliasaddresstext);
	}
	
	public void regclick()
	{
		reg_btn.click();
	}
}

