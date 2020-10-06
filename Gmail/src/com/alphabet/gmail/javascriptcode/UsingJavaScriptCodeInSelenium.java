package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class UsingJavaScriptCodeInSelenium extends BasicSettings3 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=setUp("https://www.google.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("console.log('hello world');");
		js.executeScript("alert('this is the alert');");	
	}
}
