package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeToolTip extends BasicSettings3 {
	public static void main(String [] ar)
	{
	
	WebDriver driver=setUp();
	WebElement element=driver.findElement(By.id("keepMeLoggedInCaptionContainer"));
	String actualToolTip =element.getAttribute("title");
	String expectedToolTip="Do not select if this computer is shared";
	if(expectedToolTip.equals(actualToolTip))
    {
    	System.out.println("Tool TipText is correct!!!!");
    
	}
	
	else
	{
		System.out.println("Tool TipText is not correct!!!!");
	}
	driver.close();
	}

}
