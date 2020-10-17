package com.qa.resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.TestUtil;

public class Base {

	public static WebDriver driver;
	public static Properties prop;
	
	public Base() 
	{
		try
		{
			
		prop = new Properties();
		
		// Creating properties file under the resources package
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/qa/resources/config.properties");
		prop.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void initialization()
	{
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\AutomationPractise\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\AutomationPractise\\Drivers\\IEDriverServer.exe");
			driver=new ChromeDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}


	
	
	
}
