package com.alphabet.gmail.testscript;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptWithURLCheckPoint extends BasicSettings1 {

	public static void main(String[] ar)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameTf=driver.findElement(By.id("username"));
		WebElement passwordTf=driver.findElement(By.name("pwd"));
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		
		boolean udisplay=userNameTf.isDisplayed();
		boolean pdisplay=passwordTf.isDisplayed();
		boolean bdisplay=loginButton.isDisplayed();
		
		if(udisplay)
		{
			System.out.println("Username TextField is displayed");
		}
		else 
		{
			System.out.println("Username TextField is not displayed");
		}
		if(pdisplay)
		{
			System.out.println("PassWord TextField is displayed");
		}
		else
		{
			System.out.println("PassWord TextField is not displayed");
		}
 		if(bdisplay)
		{
			System.out.println("LoginButton is displayed");
		}
		else
		{
			System.out.println("LoginButton is not displayed");
		}
		userNameTf.sendKeys("admin");
		passwordTf.sendKeys("manager");
		loginButton.click();
		
		mySleep(10);
		
		String ExpectedURL="https://demo.actitime.com/user/submit_tt.do";
		String ActualURL=driver.getCurrentUrl();
		
		if(ExpectedURL.equals(ActualURL))
		{
			System.out.println("Home Page is Displayed");
		}
		else
		{
			System.out.println("Home Page is Not Displayed");
		}
		
		try
		{
			driver.findElement(By.id("logoutLink")).click();
			System.out.println("Home Page is Displayed");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Home Page is Not Displayed");
		}
		
		driver.close();
		
	}

}
