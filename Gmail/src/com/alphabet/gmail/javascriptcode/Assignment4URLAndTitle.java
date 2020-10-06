package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Assignment4URLAndTitle extends BasicSettings3
{

	public static void main(String[] args)
	{
		WebDriver driver=setUp();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String str=(String)js.executeScript("return document.URL");
		
		String str1=(String)js.executeScript("return document.title");
		//js.executeScript("console.log(str);");
		System.out.println(str);
		System.out.println(str1);
		

	}

}
