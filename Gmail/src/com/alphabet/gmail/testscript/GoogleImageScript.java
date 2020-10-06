package com.alphabet.gmail.testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleImageScript extends BasicSettings{
	public static void main(String[] ar)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	
	
	WebElement logo=driver.findElement(By.id("hplogo"));
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	boolean blogo=logo.isDisplayed();
	
	if(blogo)
	{
		System.out.println("Images Found");
	}
	
	
	
	driver.close();
	}
}
