package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Assignment3ClearTextField extends BasicSettings3 
{

	public static void main(String[] args)
	{
		WebDriver driver=setUp("https://demo.vtiger.com/vtigercrm/");
		WebElement element=driver.findElement(By.id("username"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='';", element);
		System.out.println("TextField is Empty");

	}

}
