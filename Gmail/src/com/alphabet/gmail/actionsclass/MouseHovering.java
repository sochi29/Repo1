package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class MouseHovering extends BasicSettings3 
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.actitime.com/");
		WebElement featuresLink = driver.findElement(By.linkText("Features"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(featuresLink);
		actions.perform();
		//actions.moveByOffset(200, 300).contextClick().perform();
	}
}
