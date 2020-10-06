package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment4RightClickOnEditLabel extends BasicSettings3 
{

	public static void main(String[] args)
	{
       WebDriver driver = setUp("https://trello.com/login");
		
		driver.findElement(By.id("user")).sendKeys("nameishemanth@gmail.com");
		mySleepInSeconds(5);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		String xpathForJavaSessions = "//h3[text()='Personal Boards']/../..//div[text()='My Java Sessions']";
		driver.findElement(By.xpath(xpathForJavaSessions)).click();
		
		mySleepInSeconds(5);
		WebElement element=driver.findElement(By.xpath("//span[text()='Automate 100 Test Cases']"));
		System.out.println(element.getText());
		Actions actions = new Actions(driver);
		
		actions.contextClick(element).perform();
		driver.findElement(By.linkText("Edit Labels")).click();
		boolean labelDisplayed=driver.findElement(By.xpath("//span[text()='Labels']")).isDisplayed();
		if(labelDisplayed)
		{
			System.out.println("Label is displayed");
		}
		
		//Composite Actions
		//actions.moveByOffset(772, 442).doubleClick().perform();
		
		

	}

}
