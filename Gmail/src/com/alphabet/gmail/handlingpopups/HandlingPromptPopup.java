package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class HandlingPromptPopup extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("file:///E:/Ruchi%20Qspider/Selenium%20program/Class%20Study%20Material/Popups/promptpopup.html");
		Alert alert=driver.switchTo().alert();
		
		String alertMessage=alert.getText();
		System.out.println("Alert Message::"+alertMessage);
		
		
		alert.sendKeys("Ruchi");
		
		//alert.sendKeys("Khan");
		mySleepInSeconds(3);
		
	alert.accept();
	}
}
