package com.alphabet.gmail.actionsclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.javascriptcode.BasicSettings3;


public class ControlClickOnLinkInWebPage  extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://jqueryui.com/draggable/");
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//ul[@id='menu-top']/li/a"));
	
		Actions actions = new Actions(driver);
		
		actions.keyDown(Keys.CONTROL);//Key Goes to the pressed State
		
		for(WebElement link:allLinks)
		{
			actions.click(link);
		}
		
		
		actions.keyUp(Keys.CONTROL );//Releases the pressed Key
		
		
		actions.perform();
		
		driver.quit();
	}
}

//KeyDown method is to perform keyboard gesture of the Modifier Keys
//Only 3 Modifier keys are allowed Keys.CONTROL, Keys.SHIFT and Keys.ALT
//An Exception Will be thrown if other keys are used

//Once we use keyDown Method the key will be in the pressed State, so we have to release it with keyUp method





