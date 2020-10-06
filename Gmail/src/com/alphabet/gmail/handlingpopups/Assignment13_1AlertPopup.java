package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;



public class Assignment13_1AlertPopup extends BasicSettings3
{ 

	public static void main(String[] args)
	{
       
		WebDriver driver=setUp("http://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		
		driver.findElement(By.name("name")).sendKeys("Ruchi");
		mySleepInSeconds(2);
		driver.findElement(By.name("email")).sendKeys("bsbd");
		mySleepInSeconds(2);
		driver.findElement(By.name("phone")).sendKeys("6567667761");
		mySleepInSeconds(2);
		driver.findElement(By.name("message")).sendKeys("Hello, Need to enquire!!!");
		mySleepInSeconds(2);
		driver.findElement(By.className("button")).click();
		mySleepInSeconds(2);
		
		String expectedMsg="Please Enter Your valid email";
		Alert alert=driver.switchTo().alert();
		String actualMsg=alert.getText();
		
		if(actualMsg.equalsIgnoreCase(expectedMsg))
		{
			System.out.println("Alert Popup Displayed with right message!!!");
		}
		else 
		{
			System.out.println("Alert PopUp is not Displayed!!!");
		}
		mySleepInSeconds(4);
		
		alert.accept();
	}

}
