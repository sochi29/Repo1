package com.alphabet.gmail.testscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingRadioButtonsInFacebook extends BasicSettings3
{

	public static void main(String[] args)
	{
		WebDriver driver=setUp("https://www.facebook.com/");
		WebElement element=driver.findElement(By.linkText("Create New Account"));
		element.click();
		System.out.println("Create New Account Button is clicked");
		 element =driver.findElement(By.id("u_1_n"));
		 
		 System.out.println("Element Found");
		 List <WebElement> radioButton=element.findElements(By.tagName("input"));
		 
		
		 for(WebElement radioButtons:radioButton)
		 {
			 
			 System.out.println("Name of the attribute:-"+radioButtons.getAttribute("name"));
			 
			
		 }
		 
        
		 System.out.println("Count of the radiobuttons:-"+radioButton.size());
	}

}
 