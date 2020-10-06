package com.alphabet.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintNoOfTableElement extends BasicSettings3 {

	public static void main(String[] args)
	{
		WebDriver driver=setUp("file:///E:/Ruchi%20Qspider/Selenium%20program/Class%20Study%20Material/index%20(6).html");
		WebElement element=driver.findElement(By.id("student"));
		List<WebElement> tData=element.findElements(By.tagName("td"));
		int numCount=0;
		for(WebElement data:tData)
		{
			String str=data.getText();
			try
			{
			  System.out.println("Number Text is:-"+Integer.parseInt(str));
			  numCount++;
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Not a Number Text "+data.getText());
				
			}
		}
  
		
		System.out.println("Total no of Number text is:-"+numCount);
		driver.close();
	}

}
