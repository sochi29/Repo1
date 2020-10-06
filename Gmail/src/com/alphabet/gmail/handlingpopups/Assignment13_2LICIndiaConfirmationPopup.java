package com.alphabet.gmail.handlingpopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alphabet.gmail.javascriptcode.BasicSettings3;
public class Assignment13_2LICIndiaConfirmationPopup extends BasicSettings3
{

	public static void main(String[] args)
	{
      
		WebDriver driver=setUp("https://www.licindia.in/");
		driver.findElement(By.linkText("Customer Portal")).click();
		
		mySleepInSeconds(5);

		String expectedUrl= "https://www.licindia.in/";
		Alert alert=driver.switchTo().alert();
		
		
		alert.dismiss();
		String actualUrl= driver.getCurrentUrl();
		
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("URl doesnot change!!!!");
		}
		
		
	}

}
