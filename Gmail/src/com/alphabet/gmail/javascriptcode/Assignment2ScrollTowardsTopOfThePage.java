package com.alphabet.gmail.javascriptcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Assignment2ScrollTowardsTopOfThePage  extends BasicSettings3
{

	public static void main(String[] args)
	{
		WebDriver driver=setUp("https://www.monsterindia.com/trex/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		js.executeScript("console.log('Scrolled down');");
		js.executeScript("window.scrollTo(0,-1000)");
		System.out.print("Scrolled up");
	}

}
