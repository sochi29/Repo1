package com.alphabet.gmail.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VtigerAppForTextBox extends BasicSettings3 {

	public static void main(String[] args) {
		
    WebDriver driver=setUp("https://demo.vtiger.com/vtigercrm/");
    WebElement element=driver.findElement(By.id("username"));
   
    if(element.getAttribute("value")!=null) 
    {
      System.out.println("Text present in textfield is:-"+element.getAttribute("value"));
           
      element.clear();
      element.sendKeys("Mohan");
      System.out.println("Now Text present in textfield is:-"+element.getAttribute("value"));
      
    }
   
    else
    {
      System.out.println("There is no Value Present in TexTField!!!!");
    }
    
	}

}
