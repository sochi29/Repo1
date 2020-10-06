package com.alphabet.gmail.handlingframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.alphabet.gmail.javascriptcode.BasicSettings3;

public class SelectingMonthsInFacebook extends BasicSettings3
{
	public static void main(String[] args) 
	{
		WebDriver driver = setUp("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement monthListBox=driver.findElement(By.id("month"));
		
		Select s = new Select(monthListBox);
		List<WebElement> months=s.getOptions();
		for(WebElement month:months)
		{
			s.selectByVisibleText(month.getText());
		}	
	}
}

