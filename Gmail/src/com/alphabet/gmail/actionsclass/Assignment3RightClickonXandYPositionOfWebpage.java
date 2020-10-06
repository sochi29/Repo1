package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment3RightClickonXandYPositionOfWebpage extends BasicSettings3
{

	public static void main(String[] args)
	{
		WebDriver driver=setUp("https://www.google.com/");
		
		Actions actions=new Actions(driver);
		actions.moveByOffset(500, 600).contextClick().perform();
         System.out.println("Clicked!!!!");
	}

}
