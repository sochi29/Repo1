package com.alphabet.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingButtonsInFacebook extends BasicSettings3
{

	public static void main(String[] args) 
	{
		WebDriver driver=setUp("https://www.facebook.com/");
		WebElement element=driver.findElement(By.id("u_0_a"));
		List<WebElement> buttonElement=element.findElements(By.tagName("button"));
		int a=buttonElement.size();
		for(WebElement index:buttonElement)
		{   
		   System.out.println("Name of the Button:-"+index.getAttribute("name"));
		}
		 driver.findElement(By.linkText("Create New Account")).click();

		 
		 
       element =driver.findElement(By.id("reg_form_box"));
		 
		 
		 buttonElement=element.findElements(By.tagName("button"));
		 
		
		 for(WebElement index:buttonElement)
		 {
			 
			 System.out.println("Name of the button:-"+index.getAttribute("name"));
			 
			
		 }
		 
		 int b=buttonElement.size();
		 System.out.println("Count of the Buttons:-"+(a+b));

	}

}
