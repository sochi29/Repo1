package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitToClickOnAButton2 extends BasicSettings2 {
	public static void main(String[] args) 
	{
		WebDriver driver = setUp();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		
		driver.findElement(By.id("loginButton")).submit();
	
	}

}
