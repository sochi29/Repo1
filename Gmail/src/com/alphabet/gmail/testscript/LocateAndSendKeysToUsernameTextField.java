package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateAndSendKeysToUsernameTextField extends BasicSettings {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userNameTB = driver.findElement(By.id("username"));
		userNameTB.sendKeys("admin");
		
	}

}
