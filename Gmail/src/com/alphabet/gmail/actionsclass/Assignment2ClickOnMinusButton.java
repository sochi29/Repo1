package com.alphabet.gmail.actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class Assignment2ClickOnMinusButton extends BasicSettings3
{

	public static void main(String[] args)
	{
		String path="https://live.skillrary.com/testing-app/product.php?product=selenium-training";
		WebDriver driver=setUp(path);
		
		WebElement addButton = driver.findElement(By.id("add"));
		Actions actions = new Actions(driver);
		actions.doubleClick(addButton).perform();
		
		mySleepInSeconds(5);
		WebElement minusButton=driver.findElement(By.id("minus"));
		Actions actions1=new Actions(driver);
		actions1.doubleClick(minusButton).perform();;

	}

}
