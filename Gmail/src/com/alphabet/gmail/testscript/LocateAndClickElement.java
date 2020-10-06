package com.alphabet.gmail.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class LocateAndClickElement extends BasicSettings {
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		WebElement closeButton = driver.findElement(By.className("dismiss"));
		
		closeButton.click();		
	}
		
}


